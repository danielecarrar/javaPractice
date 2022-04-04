package array_loop_logic;

public class NumbersSwich {
	public static void main(String[] args) {

		String word = "none";
		
		if(args.length > 0) {
			word = args[0];
		}
		converterMode(word);
	}

	public static long converterMode(String word) {
		long result = 0L;
		word.toLowerCase();
		switch (word) {
		case "one":
			result = 1L;
			break;
		case "two":
			result = 2L;
			break;
		case "three":
			result = 3L;
			break;
		case "five":
			result = 5L;
			break;
		case "six":
			result = 6L;
			break;
		case "four":
			result = 4L;
			break;
		case "seven":
			result = 7L;
			break;
		case "eight":
			result = 8L;
			break;
		case "nine":
			result = 9L;
			break;
		case "ten":
			result = 10L;
			break;
		default:
			System.out.println("none match, double check!");

		}
		System.out.println(result);
		return result;
	}

}
