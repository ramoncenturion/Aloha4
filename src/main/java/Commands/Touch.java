package commands;

import exceptions.FileAlreadyExistsException;
import exceptions.InvalidFileNameException;
import interprete.Context;
import interprete.Directory;
import interprete.File;

public class Touch extends Command{

	public Touch(Context context) {
		super(context);
	}

	@Override
	public String execute(String name) {
		try {			
			if (name.length() > 100 || name.split(" ").length > 1) {
				throw new InvalidFileNameException();
			} else if (!existFile(context, name)){
				Directory carpetaActual = this.context.getCarpetaActual();
				carpetaActual.addFile(new File(name, carpetaActual));
				return "";
			} else {
				throw new FileAlreadyExistsException();
			}
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	private boolean existFile(Context context, String name) {
		Directory carpetaActual = context.getCarpetaActual();
		return carpetaActual.getFiles().containsKey(name);
	}

}
