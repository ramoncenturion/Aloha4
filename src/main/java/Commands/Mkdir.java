package commands;

import exceptions.DirectoryAlreadyExistsException;
import exceptions.InvalidFolderNameException;
import interprete.Context;
import interprete.Directory;

public class Mkdir extends Command {

	public Mkdir(Context context) {
		super(context);
	}

	@Override
	public String  execute(String name) {
		try {
			if (name.length() > 100 || name.split(" ").length > 1) {
				throw new InvalidFolderNameException();
			} else if (!existDirectory(this.context,name)){
				Directory carpetaActual = this.context.getCarpetaActual();
				carpetaActual.addDirectory(new Directory(name,carpetaActual));
				return "";
			} else {
				throw new DirectoryAlreadyExistsException();
			}	
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	private boolean existDirectory(Context context, String name) {
		Directory carpetaActual = context.getCarpetaActual();
		return carpetaActual.getDirectories().containsKey(name);
	}
	
}
