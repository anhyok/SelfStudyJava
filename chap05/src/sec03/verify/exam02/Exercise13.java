package sec03.verify.exam02;

public class Exercise13 {
	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("Login Success!");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("FAIL: Wrong ID");
		} else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("FAIL: Wrong Password");
		}
	}
}


