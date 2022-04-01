package chessPieces;

public class King extends CommonControls {

	private String name;

	public King(String name, String color, int forward, int side, boolean isAlive, String startingPosition) {
		super(color, forward, side, isAlive, startingPosition);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name: " + name + ", color=" + color + ", forward= " + forward + ", side= " + side + ", alive= "
				+ isAlive + ", startingPosition=" + startingPosition;
	}
}
