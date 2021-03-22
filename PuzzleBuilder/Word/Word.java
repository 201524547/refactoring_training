package PuzzleBuilder.Word;

public abstract class Word {
	private String value;
	private int xStartPosition;
	private int yStartPosition;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getxStartPosition() {
		return xStartPosition;
	}
	public void setxStartPosition(int xStartPosition) {
		this.xStartPosition = xStartPosition;
	}
	public int getyStartPosition() {
		return yStartPosition;
	}
	public void setyStartPosition(int yStartPosition) {
		this.yStartPosition = yStartPosition;
	}
	public abstract int getPoint();
	public abstract int getWordType();
}
