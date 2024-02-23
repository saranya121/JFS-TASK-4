package task2;

public class InvalidAgeException extends Exception {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public InvalidAgeException(String message) {
		super();
		this.message = message;
	}

}
