package cv01;

public class Directory {
	public String NAME;
	public Directory left;
	public Directory right;
	
	Directory(String name){
		this.NAME = name;
	}
}
