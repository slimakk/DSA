package cv01;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("afheshzx", "skoda", false);
		car1.Price = 100;
		car1.mileage = 100000;
		car1.printVin();
		
		Car car2 = new Car("fjzagalk","audi", true);
		car2.Price = 500;
		car2.mileage = 500000;
		
		Car car3 = new Car("afuho", "bmw", true);
		car3.Price = 300000;
		car3.mileage = 5;
		
		car1.neighbour = null;
		car2.neighbour = car1;
		car3.neighbour = car2;
		
		car3.neighbour.printVin();
		car3.neighbour.neighbour.printVin();
		
		Map map = new Map();
		map.EastCar = car1;
		map.NorthCar = car2;
	}

}
