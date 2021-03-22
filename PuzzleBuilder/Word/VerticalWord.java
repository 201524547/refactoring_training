package PuzzleBuilder.Word;

public class VerticalWord extends Word {	
	public VerticalWord(String value, int x, int y) {
		this.setValue(value);
		this.setxStartPosition(x);
		this.setyStartPosition(y);;
	}
	public int getPoint() {
		return getValue().length() * 2;
	}

	public int getWordType() {return 1;}
}
