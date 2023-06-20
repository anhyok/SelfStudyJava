package sec02.exam04intfc;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof FlyingTaxi) {
			//vehicle.BASE_FARE = 5000;
			Aircraft air = (FlyingTaxi)vehicle;
			air.takeoff();
		}
		vehicle.run();
	}
}
