package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
<<<<<<< HEAD
		int v2 = 0; // fixed
		if(v1>10) {
//			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
=======
		int v2 = 0;
		if(v1>10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
>>>>>>> fa149e662101e85ef4201052469fb508b50c5b2d
	}

}
