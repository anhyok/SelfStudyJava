package sec02.exam04intfc;

public class FlyingTaxi implements Vehicle, Aircraft {

	@Override
	public void takeoff() {
		System.out.println("�ý�x�� �̷��մϴ�.");		
	}
	
	@Override
	public void run() {
		System.out.println("�ý�x�� �����մϴ�.");
	}

}
