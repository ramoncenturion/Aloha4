package exceptions;

public class InvalidFileNameException extends Exception {

	private static final long serialVersionUID = -8637537467739410924L;

	public InvalidFileNameException() {
		super("Invalid File Name");
	}
}
