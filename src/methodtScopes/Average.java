package methodtScopes;

public class Average {
	public static void main(String[] arguments) {
		int sum = 0;
		if (arguments.length > 0) {
			for (int i = 0; i < arguments.length; i++) {
				System.out.println("Number entered: " + arguments[i]);
				sum += Integer.parseInt(arguments[i]);
			}
			System.out.println("\nSum is: " + sum);
			System.out.println("Average is: " + (float) sum / arguments.length);
		}
	}
}
