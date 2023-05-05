package midterm.coding1;

public class Stars {

	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("\\");
		}
		
		//°­½ÂÀ±
//		for(int m=1; m<=6; m++) {
//			for(int n=1; n<m; n++) {
//				System.out.print("*");
//			}
//			System.out.println("\\");
//		}

		//°í½Â¿ø
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
////			System.out.println("\");
//			System.out.println();
//		}
		
		//±è´ëÇü
//		for(int i=0; i<=6; i++) {
//			for(int j=0; j<=i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\\");
//		}
		
		//±è¾Ö¼Ö
//		for(int i=0; i<=5; i++) {
//			for(int j=1; j<=6; j++) {
//				System.out.print(i);
//			}
////			System.out.println(j);
//		}
		
		//±èÁ¾¹ü
//		for(int i=6; i>=1; i--) {
//			for(int k=1; k<=6-i; k++) {
//				System.out.print("*");
//			}
////			System.out.println("\");
//			System.out.println("\\");
//		}
		
		//±èÁÖ¿ø 
//		for(int i=0; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
////			System.out.println("\\");
//			System.out.println("\\");
//		}
		
		//ÀÌÁ¤¸í
//		System.out.println("----");
//		for(int j=1; j<=1; j++) { //for(int j=1; j=1; ) ==> j<=1, j++ÀÌ¶ó °¡Á¤
//			for(int i=0; i<=5; i++) {
//				System.out.print("*");
//			}
//			System.out.println("'\\'\n");
		
		//ÀÌÁ¦¹Î
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			//System.out.println(f"\");
//			System.out.println("\\");
//		}
		
		//ÀÌÁØÈ£
//		for(int i=6; i>=1; i--) {
//			for(int j=1; i>=j; j++) { //for(int j=1; i>=; i++) {
//				System.out.print(j); //System.out.println(i);
//			}
//			System.out.println(i); //System.out.print(j);
//		}

		//ÀÓÁö¼ö
//		for(int i=0; i<=5; i++) {
//			for(int k=0; k<i; k++) { //\for(int k=0; k<5; k++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("\");
//		}
		
		//¹Ú»óÇå
//		for(int i=0; i<=6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("\/n");
//		}
		
		//ÀÓÃ¤¿ø
//		for(int i=0; i<=6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("\");
//		}
		
		//Àå¼öÇõ
//		for(int i=0; i<6; i++) {
//			for(int k=0; k<i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("'\");
//		}
		
		//Àå¿ìÇõ
//		for(int i=7; i>1; i--) { //for(int i=7; i>1; i++) {
//			for(int j=1; j>1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("'\");
//		}
		
		//ÀåÁØ¼­
//		for(int i=0; i<=5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("\");
//		}
		
		//ÃµÀ±¼ö
//		for(int i=1; i<=6; i++) {
//			for(int k=1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("\\"); //System.out.println("\");
//		}
		
		//È²µ¿ÇÏ
		for(int i=0; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("\\"); //System.out.println("\");
		}
	}

}
