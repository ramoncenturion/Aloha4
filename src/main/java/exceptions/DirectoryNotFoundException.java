package exceptions;

public class DirectoryNotFoundException extends Exception {

	private static final long serialVersionUID = 8366247750143626003L;

	
	public DirectoryNotFoundException() {
		super("Directory Not Found");
	}
}
