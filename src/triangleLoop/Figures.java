package triangleLoop;

public class Figures {

	public static void main(String[] args) {

		// increasing triangle

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		// decreasing triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		// opposite triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// increasing big triangle
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				// try to code "j<=i; and see the differences!
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// pring increasing number in rows
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// oppose version
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// correct vesion using another value
		for (int i = 1, p = 0; i <= 5; i++, p += 2) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		// even/odd rows

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print("§");
				}
			}
			System.out.println();
		}

	}
}
