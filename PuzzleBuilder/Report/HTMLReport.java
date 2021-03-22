package PuzzleBuilder.Report;

import PuzzleBuilder.Word.Word;

public class HTMLReport extends Report {
	public String headerString(String name) {
		return "<H1> Report on Puzzle <EM> " + name + "</EM></H1>\n";
	}
	public String eachWordString(Word aWord) {
		return "\tWord: <B>" + aWord.getValue()
				+ "\tPosition: ["+ aWord.getxStartPosition() + ", " + aWord.getxStartPosition() + "]"
				+ "\tDir: " + aWord.getWordType()
				+ " </B> Point: <B> " + aWord.getPoint() + "</B>\n";
	}
	public String footerString(int point) {
		return "<HR> Total Point: <B>" + point + "</B><P>\n";
	}
}
