package commands;

import exceptions.DirectoryNotFoundException;
import exceptions.InvalidFolderNameException;
import interprete.Context;
import interprete.Directory;

public class Cd extends Command {

	public Cd(Context context) {
		super(context);
	}

	@Override
	public String execute(String name) {
		try {
			if (name.equals("..")) {
				goToParentDirectory(name, this.context);
			} else if (!isCorrectName(name)) {
				throw new InvalidFolderNameException();
			} else if (!existDirectory(name, this.context)) {
				throw new DirectoryNotFoundException();
			} else {
				Directory directory = this.context.getCarpetaActual().getDirectories().get(name);
				this.context.setCarpetaActual(directory);
			}
			return "";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	
	private void goToParentDirectory(String name, Context context) {
		Directory parent = context.getCarpetaActual().getParentDirectory();
		context.setCarpetaActual(parent);
	}

	private boolean existDirectory(String name, Context context) {
		Directory carpetaActual = context.getCarpetaActual();
		return carpetaActual.getDirectories().containsKey(name);
	}

	private boolean isCorrectName(String name) {
		// TODO regex caracteres incorrectos
		return true;
	}

}
