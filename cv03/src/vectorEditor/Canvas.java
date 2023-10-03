package vectorEditor;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class Canvas {
	private int width;
	private int height;
	
	private LinkedList<GraphicalObject> objects = new LinkedList<>();
	
	private BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	
	private Graphics2D g = (Graphics2D) img.getGraphics();
	
	public Canvas(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void addObject(GraphicalObject object)
	{
		objects.add(object);
	}
	
	public void renderToImage(String filename) {
		System.out.println("File: "+ filename + " has been created");
	}
}
