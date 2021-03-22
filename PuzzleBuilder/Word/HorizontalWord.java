package PuzzleBuilder.Word;

public class HorizontalWord extends Word{
	public HorizontalWord(String value, int x, int y) {
		this.setValue(value);
		this.setxStartPosition(x);
		this.setyStartPosition(y);;
	}
	public int getPoint() {
		return getValue().length();
	}
	public int getWordType() {return 0;}
}
