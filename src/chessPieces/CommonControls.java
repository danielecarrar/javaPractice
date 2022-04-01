package chessPieces;

public class CommonControls {

	protected String color;
	protected int forward;
	protected int side;
	protected boolean isAlive;
	protected String startingPosition;

	public CommonControls(String color, int forward, int side, boolean isAlive, String startingPosition) {
		this.color = color;
		this.forward = forward;
		this.side = side;
		this.isAlive = isAlive;
		this.startingPosition = startingPosition;
	}
}
