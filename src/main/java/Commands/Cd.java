package Commands;

import interprete.Context;
import interprete.Directory;

public class Cd extends Command {

	@Override
	public String execute(String name, Context context) {
		if (name.equals("..")) {
			goToParentDirectory(name, context);
		} else if (!isCorrectName(name)) {
			return "Invalid Folder Name";
		} else if (!existDirectory(name, context)) {
			return "Directory not found";
		} else {
			Directory directory = context.getCarpetaActual().getDirectories().get(name);
			context.setCarpetaActual(directory);
		}
		return "";
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
