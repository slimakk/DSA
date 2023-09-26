package cv02;

import java.util.Vector;

public class Map {
	private Vector<Car> cars = new Vector<>();
	
	public void addAuto(Car car)
	{
		cars.add(car);
	}
	
	public void removeAuto(int index) {
		cars.remove(index);
	}
	
	public void removeAuto(Car car) {
		cars.remove(car);
	}
	
	public int getPocetAut() {
		return cars.size();
	}
	
	public Car getAuto(int index) {
		return cars.get(index);
	}
	
	public void printCars() {
		for(Car car : cars)
		{
			System.out.println("Car"+ car.getName() + "is on position {" + car.getX() + "," + car.getY() + "}" );
		}
	}
}
