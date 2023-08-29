package java1;

public class SwapVariables {
	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";
		
		String temp = y;
		
		y = x ;
		x = temp;
		
		System.out.println("X : " + x);
		System.out.println("Y : " + y);

	}
}
