package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) { // q 입력 시 종료
				System.out.println("Bye!!");
				break;
			}
		}
	}

}
