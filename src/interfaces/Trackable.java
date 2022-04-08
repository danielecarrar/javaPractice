package interfaces;
//interfaces are public
//variables are public static final 
//methods are public abstract
public interface Trackable {

	public static final int id = 0;
	
	void useId();
	
	 public abstract Trackable
	 beginTracking(Trackable self);
	 

}
