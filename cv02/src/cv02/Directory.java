package cv02;

public class Directory {
	private Directory LeftDirectory;
	private Directory RightDirectory;
	
	public Directory getLeftDirectory() {
		return LeftDirectory;
	}
	public void setLeftDirectory(Directory leftDirectory) {
		LeftDirectory = leftDirectory;
	}
	public Directory getRightDirectory() {
		return RightDirectory;
	}
	public void setRightDirectory(Directory rightDirectory) {
		RightDirectory = rightDirectory;
	}
	
	
}
