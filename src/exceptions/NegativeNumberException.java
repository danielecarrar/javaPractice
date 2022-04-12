package exceptions;

public class NegativeNumberException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	String message;

	public NegativeNumberException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
