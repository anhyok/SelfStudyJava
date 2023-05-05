package kr.hyok.evaluation.stars;

public class DrawingStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		System.out.println("=====");
//		
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//		System.out.println("=3====");
//		
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println("*");
//		}
//		
//		System.out.println("=4====");
//		
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//		System.out.println("=====");
//		
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("=====");
//		
//		for(int i=10; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=0; i<10; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=1; j<10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		String[] strArray = {"10", "2a"};
//		int value = 0;
//		for(int i=0; i<=2; i++) {
//			try {
//				value = Integer.parseInt(strArray[i]);
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("인덱스를 초과했음");
//			}
//			catch(NumberFormatException e) {
//				System.out.println("숫자를 변환할 수 없음");
//			}
//			finally {
//				System.out.println(value);
//			}
//		}
		
//		int avg;
//		int score1 = 10;
//		double score2 = 80.5;
//		double sum = score1 + score2;
//		avg = sum / 2;
		
//		int v1 = 0;
//		if (true) {
//			int v2 = 0;
//			if (true) {
//				int v3 = 0;
//				v1 = 1;
//				v2 = 1;
//				v3 = 1;
//			}
//			v1 = v2 + v3;
//		}
//		System.out.println(v1);

//		char result = 10 + 20;
//		System.out.println((int)result);
		
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = var1 / var2; //(double)
//		int var4 = (int)(var3 * var2);
//		System.out.println(var4);
		
//		switch(8) {
//			case 8:
//				System.out.print("1");
//			case 9:
//				System.out.print("2");
//			case 10:
//				System.out.print("3");
//			default:
//				System.out.print("4");
//		}
//		System.out.print("5");

//		int i;
//		for (i = 0; i <= 10; i++) {
//		    System.out.println(i);
//		}
//		System.out.println(i);

//		for(int i=10; i>=1; i--) { //A.	① 10  ② i--  ③ j<=i  ④ j<=11+i
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=11+i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=11; i>=1; i++) { //B.	① 11  ② i++  ③ j<i  ④ j<=10-i // Loop
//			for(int j=1; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=10; i>=1; i++) { //C.	① 10  ② i++  ③ j<i  ④ j<=10-i // Loop
//			for(int j=1; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=10-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=11; i>=1; i--) { //D.	① 11  ② i--  ③ j<=i  ④ j<=11+i
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=11+i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		

	}
}
