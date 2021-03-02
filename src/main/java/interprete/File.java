package interprete;

public class File {

	String path;
	String name;
	Directory parentDirectory;
	
	public File(String name, Directory directory) {
		this.name = name;
		this.path = directory.getPath()+"/"+name;
		this.parentDirectory = directory;
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
	
	
}
