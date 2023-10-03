package vectorEditor;

import java.util.LinkedList;

public class GraphicalContainer extends GraphicalObject{
	private LinkedList <GraphicalObject> objects = new LinkedList<>();
	
	public GraphicalContainer(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
	public void addObject(GraphicalObject object)
	{
		objects.add(object);
	}

}
