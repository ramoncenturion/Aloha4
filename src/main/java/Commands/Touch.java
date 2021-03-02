package Commands;

import interprete.Context;
import interprete.Directory;
import interprete.File;

public class Touch extends Command{

	@Override
	public String execute(String name, Context context) {

		if (name.length() > 100 || name.split(" ").length > 1) {
			return "Invalid File or Folder Name";
		} else if (!existFile(context, name)){
			Directory carpetaActual = context.getCarpetaActual();
			carpetaActual.addFile(new File(name, carpetaActual));
			return "";
		} else {
			return "File already exists";
		}
	}

	private boolean existFile(Context context, String name) {
		Directory carpetaActual = context.getCarpetaActual();
		return carpetaActual.getFiles().containsKey(name);
	}

}
