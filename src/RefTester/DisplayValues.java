package RefTester;

public class DisplayValues {

	Integer height;
	Integer width;
	Integer depth;
	
	
	
	public DisplayValues(Integer height, Integer width, Integer depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}



	public static void main(String[] args) {
		DisplayValues d1 = new DisplayValues(8, 14, 90);
	System.out.println(d1.depth + "\t" + d1.height + "\t" + d1.width);
	}

}
