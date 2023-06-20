package sec02.exam04abs;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void stop() {
		System.out.println("버스 정류장에 일시정지합니다.");
	}
}
