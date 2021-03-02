package exceptions;

public class InvalidFolderNameException extends Exception {

	private static final long serialVersionUID = -3010728032337383738L;

	public InvalidFolderNameException() {
		super("Invalid Folder Name");
	}
}
