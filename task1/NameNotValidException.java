package task1;

public class NameNotValidException extends Exception {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public NameNotValidException(String message) {
		super();
		this.message = message;
	}

}
