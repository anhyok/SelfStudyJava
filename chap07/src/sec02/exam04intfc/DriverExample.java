package sec02.exam04intfc;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		FlyingTaxi flytaxi= new FlyingTaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(flytaxi);
	}
}
