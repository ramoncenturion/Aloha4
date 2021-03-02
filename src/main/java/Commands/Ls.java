package Commands;

import java.util.Iterator;
import java.util.Map;

import interprete.Context;
import interprete.Directory;
import interprete.File;

public class Ls extends Command{

	@Override
	public String execute(String parameters, Context context) {
		if (parameters.isEmpty()) {
			// ls de la carpeta
			return generateList(context);
		} else if (parameters.equals("-r")) {
			// ls recursivo
			return generateRecursiveList(context);
		} else {
			return "Invalid Command";
		}
	}

	private String generateRecursiveList(Context context) {
		StringBuilder list = new StringBuilder();
		recursiveList(context.getCarpetaActual(),list);
		return list.toString();
	}

	private void recursiveList(Directory carpeta, StringBuilder list) {
		Map<String, File> files = carpeta.getFiles();
		files.forEach((name,directoriesChild) -> {
			list.append(name); 
			list.append(System.lineSeparator ());
		});
		Map<String, Directory> directories = carpeta.getDirectories();
		directories.forEach((name,directoriesChild) -> {
			list.append(name); 
			list.append(System.lineSeparator ());
			recursiveList(directoriesChild, list);
		});
	}

	private String generateList(Context context) {
		StringBuilder result = new StringBuilder();
		Map<String, Directory> directories = context.getCarpetaActual().getDirectories();
		directories.forEach((name,directoriesChild) -> {
			result.append(name); 
			result.append(System.lineSeparator ());
		});	
		Map<String, File> files = context.getCarpetaActual().getFiles();
		files.forEach((name,directoriesChild) -> {
			result.append(name); 
			result.append(System.lineSeparator ());
		});
		return result.toString();
	}

}
