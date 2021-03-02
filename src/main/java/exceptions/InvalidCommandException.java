package exceptions;

public class InvalidCommandException extends Exception {

	private static final long serialVersionUID = -3835326239959660003L;

	public InvalidCommandException() {
		super("Invalid Command");
	}
}
