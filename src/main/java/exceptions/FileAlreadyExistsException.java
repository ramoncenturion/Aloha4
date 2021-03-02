package exceptions;

public class FileAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 2021040397690531757L;
	
	public FileAlreadyExistsException() {
		super("File Already Exists");
	}

}
