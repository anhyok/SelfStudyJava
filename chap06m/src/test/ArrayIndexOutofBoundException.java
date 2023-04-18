package test;

public class ArrayIndexOutofBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Test", "Exception"};
		String data1 = arr[1];
//		String data2 = arr[2];    // Exception

		System.out.println("Array [1]: " + data1);
//		System.out.println("Array [2]: " + data2);


	}

}
