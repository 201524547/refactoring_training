package PuzzleBuilder.Report;

import PuzzleBuilder.PuzzleBuilder;
import PuzzleBuilder.Word.Word;

public abstract class Report {
	public String getFullReport(PuzzleBuilder puzzleBuilder) {
		String value;
		value = headerString(puzzleBuilder.getName());
		for(int i = 0; i < puzzleBuilder.getSize(); i++) {
			value += eachWordString(puzzleBuilder.getWord(i));
		}
		value += footerString(puzzleBuilder.getPoint());
		return value;
	}
	public String getShortReport(PuzzleBuilder puzzleBuilder) {
		String value;
		value = headerString(puzzleBuilder.getName());
		value += footerString(puzzleBuilder.getPoint());
		return value;
	}
	
	public abstract String headerString(String name);
	public abstract String eachWordString(Word aWord);
	public abstract String footerString(int point);
}
