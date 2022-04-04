package array_loop_logic;

public class SwichCaseZX {
	
		public static void main(String[] arguments) {
			float x = 9;
			float y = 5;
			int z = (int) (x / y);
			System.out.println(z);
			switch (z) {
			case 1:
				System.out.println(x + " z " + z);
				x = x + 2;
			case 2:
				System.out.println(x + " z " + z);
				x = x + 3;
			default:
				System.out.println(x + " z " + z);
				x = x + 1;
			}
			System.out.println(x + " z " + z);
			System.out.println("Value of x: " + x);
		}
	
}
