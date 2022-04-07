package methodtScopes;

import java.awt.Point;

public class FourDPoint extends Point {

	private static final long serialVersionUID = 1L;
	
	int a;
	int b;

	public FourDPoint(int x, int y, int a, int b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}

}
