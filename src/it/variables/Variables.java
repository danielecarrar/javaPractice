package it.variables;

public class Variables {
	public static void main(String[] arguments) {
		final char UP = 'U';
		byte initialLevel = 12;
		short location = 13_250;
		int score = 3_500_100;
		boolean newGame = true;

		System.out.println("You have reached level " + initialLevel + " with a score of " + score + " at location "
				+ location + ".");
		System.out.println("Press " + UP + " to go up.");
		System.out.println("Is this a new game? " + newGame);
	}

}
