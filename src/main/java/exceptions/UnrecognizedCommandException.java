package exceptions;

public class UnrecognizedCommandException extends Exception {

	private static final long serialVersionUID = -7853730339213836041L;

	public UnrecognizedCommandException() {
		super("Unrecognized Command");
	}
}
