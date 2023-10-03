package vectorEditor;

public abstract class GraphicalObject {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public GraphicalObject(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();

}
