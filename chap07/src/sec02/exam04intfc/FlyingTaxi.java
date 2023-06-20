package sec02.exam04intfc;

public class FlyingTaxi implements Vehicle, Aircraft {

	@Override
	public void takeoff() {
		System.out.println("택시x가 이륙합니다.");		
	}
	
	@Override
	public void run() {
		System.out.println("택시x가 비행합니다.");
	}

}
