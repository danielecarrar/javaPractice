package array_loop_logic;

public class HalfDollar {
	public static void main(String[] arguments) {
		
		int[] denver = { 2_100_000, 2_900_000, 6_100_000 };
		int[] philadelphia = new int[denver.length];
		int[] total = new int[denver.length];
		int average;
		
		philadelphia[0] = 2_100_000;
		philadelphia[1] = 1_800_000;
		philadelphia[2] = 4_800_000;
		
		total[0] = denver[0] + philadelphia[0];
		total[1] = denver[1] + philadelphia[1];
		total[2] = denver[2] + philadelphia[2];
		
		average = (total[0] + total[1] + total[2]) / 3;
		
		System.out.print("2016	production: ");
		System.out.format("%,d%n", total[0]);
		System.out.print("2017	production: ");
		System.out.format("%,d%n", total[1]);
		System.out.print("2018 production: ");
		System.out.format("%,d%n", total[2]);
		System.out.print("Average production: ");
		System.out.format("%,d%n", average);
		
		//multidimensional example
		int[][][] cen = new int[100][52][7];
		System.out.println("\nElements in 1st dimension: "
		+ cen.length);
		System.out.println("Elements in 2nd dimension: "
		+ cen[0].length);
		System.out.println("Elements in 3rd dimension: "
		+ cen[0][0].length);
	
	}//check HalfLooper for another version
}
