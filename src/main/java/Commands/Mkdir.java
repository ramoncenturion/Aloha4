package Commands;

import interprete.Context;
import interprete.Directory;

public class Mkdir extends Command {

	@Override
	public String  execute(String name, Context context) {
		
		if (name.length() > 100 || name.split(" ").length > 1) {
			return "Invalid File or Folder Name";
		} else if (!existDirectory(context,name)){
			Directory carpetaActual = context.getCarpetaActual();
			carpetaActual.addDirectory(new Directory(name,carpetaActual));
		}
		return "";
	}

	private boolean existDirectory(Context context, String name) {
		Directory carpetaActual = context.getCarpetaActual();
		return carpetaActual.getDirectories().containsKey(name);
	}
	
}
