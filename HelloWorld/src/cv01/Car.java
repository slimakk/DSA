package cv01;

public class Car {
	public int Price;
	private String VIN = "ahojahojcoty";
	private String brand;
	private boolean abs;
	public int mileage;
	public Car neighbour;
	
	Car(String vin, String brand, boolean ABS){
		this.VIN = vin;
		this.brand = brand;
		this.abs = ABS;
	}
	
	public void printVin() {
		System.out.println(VIN);
	}
}
