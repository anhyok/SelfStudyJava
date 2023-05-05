package midterm.coding2;

abstract class Drawing {
	protected int n = 0;
	public Drawing(int n) {
		this.n = n;
	}
	abstract public void triangle();
	abstract public void reverseTriangle();
}

class DrawingStars extends Drawing {	
	public DrawingStars(int n) {
		super(n);
	}
	
	private void printStars(int i) {
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j=1; j<=n-i; j++) {
			System.out.print("*");
		}
		for(int j=1; j<n-i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	@Override
	public void triangle() {
		for(int i=n; i>0; i--) {
			printStars(i);
		}
	}
	
	@Override
	public void reverseTriangle() {
		for(int i=0; i<n; i++) {
			printStars(i);
		}
	}
}

public class Stars {
	public static void main(String[] args) {
		Drawing drawObj = new DrawingStars(5);
		drawObj.triangle();
		drawObj.reverseTriangle();
	}
}
