package exceptions;

public class DirectoryAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 4601799202177901527L;
	
	public DirectoryAlreadyExistsException() {
		super("Directory Already Exists");
	}
}
