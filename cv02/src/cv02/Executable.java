package cv02;

import java.util.Vector;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var car1 = new Car();
		var car2 = new Car();
 		var car3 = new Car();
 		
 		car1.setName("test");
 		
 		var map = new Map();
 		map.addAuto(car1);
 		map.addAuto(car2);
 		map.addAuto(car3);
 		
 		map.printCars();
	}

}
