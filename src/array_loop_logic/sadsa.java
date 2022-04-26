package array_loop_logic;

import java.util.Iterator;

public class sadsa {
	public static void main(String[] args) {
		System.out.println(Stringa("annuccia"));

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public static String Stringa(String s) {
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);

		}

		return reverse;

	}

}
