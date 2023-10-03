package vectorEditor;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas p = new Canvas(800,800);
		p.addObject(new Circle(10, 15, 30));
		p.addObject(new Circle(22, 25, 50));
		p.addObject(new Square(50, 50, 25));
		
		GraphicalContainer s = new GraphicalContainer(15, 20);
		s.addObject(new Circle(82, 96, 5));
		s.addObject(new Square(100, 100, 45));
		p.addObject(s);
		
		p.renderToImage("image.png");
	}

}
