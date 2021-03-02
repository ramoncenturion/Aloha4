package interprete;

import java.util.HashMap;
import java.util.Map;

public class Directory {

	String path;
	String name;
	Directory parentDirectory;
	Map<String, Directory> directories = new HashMap<String, Directory>();
	Map<String, File> files = new HashMap<String, File>();
			
	public Directory(String name) {
		this.name = name;
		this.path = "/"+name;
	}
	
	public Directory(String name, Directory parent) {
		this.name = name;
		this.path = parent.getPath()+"/"+name;
		this.parentDirectory = parent;
	}
	
	public Directory() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getParentDirectory() {
		return parentDirectory;
	}

	public void setParentDirectory(Directory parentDirectory) {
		this.parentDirectory = parentDirectory;
	}

	public Map<String, Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(Map<String, Directory> directories) {
		this.directories = directories;
	}

	public Map<String, File> getFiles() {
		return files;
	}

	public void setFiles(Map<String, File> files) {
		this.files = files;
	}

	public void addDirectory(Directory directory) {
		this.directories.put(directory.getName(),directory);
	}
	
	public void addFile(File file) {
		this.files.put(file.getName(),file);
	}
}
