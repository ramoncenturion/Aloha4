package commands;

import java.util.Iterator;
import java.util.Map;

import exceptions.InvalidCommandException;
import interprete.Context;
import interprete.Directory;
import interprete.File;

public class Ls extends Command{

	public Ls(Context context) {
		super(context);
	}

	@Override
	public String execute(String parameters) {
		try {
			if (parameters.isEmpty()) {
				// ls de la carpeta
				return generateList(this.context);
			} else if (parameters.equals("-r")) {
				// ls recursivo
				return generateRecursiveList(this.context);
			} else {
				throw new InvalidCommandException();
			}
		} catch (Exception e) {
			return e.getMessage();
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
			list.append(directories.get(name).getPath()); 
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
