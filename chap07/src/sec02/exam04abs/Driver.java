package sec02.exam04abs;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.stop();
		}
		vehicle.run();
	}
}
