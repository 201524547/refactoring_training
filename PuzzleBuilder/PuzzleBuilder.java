package PuzzleBuilder;

import PuzzleBuilder.Report.HTMLReport;
import PuzzleBuilder.Report.TextReport;
import PuzzleBuilder.Word.HorizontalWord;
import PuzzleBuilder.Word.VerticalWord;
import PuzzleBuilder.Word.Word;

public class PuzzleBuilder {

	private Word[] _words;
	private int index;
	private String name;

	public PuzzleBuilder(String name, int size) {
		this.name = name;
		_words = new Word[size];
		index = 0;
	}
	private boolean confirmIsConflict(Word newWord) {
		boolean isRight = false;
		for (int i = 0; i < index; i++) {
			boolean isExistingWordHorizontal = _words[i].getWordType() == 0;
			boolean isNewWordHorizontal = newWord.getWordType() == 0;
		
			boolean isSameYStartPosition = _words[i].getyStartPosition() == newWord.getyStartPosition();
			boolean isSameXStartPosition = _words[i].getxStartPosition() == newWord.getxStartPosition();
			
			boolean isXoverlap = newWord.getxStartPosition() >= _words[i].getxStartPosition() && newWord.getxStartPosition() <= _words[i].getxStartPosition() + _words[i].getValue().length();
			boolean isYOverlap = newWord.getyStartPosition() >= _words[i].getyStartPosition() && newWord.getyStartPosition() <= _words[i].getyStartPosition() + _words[i].getValue().length();
			
			boolean isXInclude = newWord.getxStartPosition() + newWord.getValue().length() >= _words[i].getyStartPosition() && newWord.getxStartPosition() + newWord.getValue().length() <= _words[i].getyStartPosition() + _words[i].getValue().length();
			boolean isYInclude = newWord.getyStartPosition() + newWord.getValue().length() >= _words[i].getyStartPosition() && newWord.getyStartPosition() + newWord.getValue().length() <= _words[i].getyStartPosition() + _words[i].getValue().length();
			
			boolean isYConflict = _words[i].getyStartPosition() >= newWord.getyStartPosition() && _words[i].getyStartPosition() <= newWord.getyStartPosition() + newWord.getValue().length();
		
			if (isExistingWordHorizontal) {
				if (isNewWordHorizontal) {
					if (isSameYStartPosition && (isXoverlap || isXInclude)) {
						isRight = true;
						break;
					}
				} else {
					if (isXoverlap && isYConflict) {
						isRight = true;
						break;
					}
				}
			} else { // 세로
				if (isNewWordHorizontal) { // 가로
					if (isXoverlap && isYOverlap) {
						isRight = true;
						break;
					}
				} else { // 세로
					if (isSameXStartPosition && (isYOverlap || isYInclude)) {
						isRight = true;
						break;
					}
				}
			}
		}
		return isRight;
	}
	private boolean confirmIsDuplicated(Word newWord) {
		for (int i = 0; i < index; i++) {
			boolean isSameWord = _words[i].getValue().compareTo(newWord.getValue()) == 0;
			boolean isSameDirection = _words[i].getWordType() == newWord.getWordType();
			if (isSameWord && isSameDirection) return true;
		}
		return false;
	}
	
	public int getSize() {return index;}
	public String getName() {return name;}
	public Word getWord(int index) {return _words[index];}

	public void addWord(String value, int x, int y, int dir) throws Exception {
		Word newWord;
		if(dir == 0) {
			newWord = new HorizontalWord(value, x, y);
		}
		else {
			newWord = new VerticalWord(value, x, y);
		}
		if(confirmIsDuplicated(newWord)) throw new Exception("중복된 정보입니다.");
		if(confirmIsConflict(newWord)) throw new Exception("잘못된 정보입니다.");
		_words[index++] = newWord;
	}


	

	public int getWordXPosition(String value, int dir) throws Exception {
		for (int i = 0; i < index; i++) {
			boolean isSameWord = _words[i].getValue().compareTo(value) == 0;
			boolean isSameDirection = _words[i].getWordType() == dir;
			if (isSameWord && isSameDirection)	return _words[i].getxStartPosition();
		}
		throw new Exception("찾는 값이 없습니다.");
	}

	public int getWordYPosition(String value, int dir) throws Exception {
		for (int i = 0; i < index; i++) {
			boolean isSameWord = _words[i].getValue().compareTo(value) == 0;
			boolean isSameDirection = _words[i].getWordType() == dir;
			if (isSameWord && isSameDirection)	return _words[i].getyStartPosition();
		}
		throw new Exception("찾는 값이 없습니다.");
	}

	public int getPoint() {
		int totalPoint = 0;
		for (int i = 0; i < index; i++) {
			totalPoint += _words[i].getPoint();
		}
		return totalPoint;
	}

	public String getShortHtmlReport() {
		HTMLReport htmlReport = new HTMLReport();
		return htmlReport.getShortReport(this);
	}
	public String getFullHtmlReport() {
		HTMLReport htmlReport = new HTMLReport();
		return htmlReport.getFullReport(this);
	}
	public String getShortReport() {
		TextReport textReport = new TextReport();
		return textReport.getShortReport(this);
	}
	public String getFullTextReport() {
		TextReport textReport = new TextReport();
		return textReport.getFullReport(this);
	}
}
