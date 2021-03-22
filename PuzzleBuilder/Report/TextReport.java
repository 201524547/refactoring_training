package PuzzleBuilder.Report;

import PuzzleBuilder.Word.Word;

public class TextReport extends Report {
	public String headerString(String name) {
		return "Report on Puzzle " + name + "\n";
	}
	public String eachWordString(Word aWord) {
		return "\tWord: " + aWord.getValue() + "\t"
				+ "Position: [" + aWord.getxStartPosition() + ", " + aWord.getxStartPosition() + "]\t"
				+ "Dir: " + aWord.getWordType()
				+ "Point: " + aWord.getPoint() + "\n";
	}
	public String footerString(int point) {
		return "Total Point: " + point + "\n";
	}
}