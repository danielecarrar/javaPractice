package chessPieces;

public class MainChess {
	public static void main(String[] args) {

		CommonControls q1 = new Queen("queen", "black", 10, 10, true, "e5");
		//CommonControls q2 = new Queen("queen", "white", 10, 10, true, "e5");

		//CommonControls k1 = new King("king", "white", 1, 1, true, "e6");
		CommonControls k2 = new King("king", "black", 1, 1, true, "e6");
		System.out.println("INFO:\n" + k2.toString());
	System.out.println(q1.forward);
	}

}
