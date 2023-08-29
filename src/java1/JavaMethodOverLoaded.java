package java1;

public class JavaMethodOverLoaded {
	public static void main(String args[]) {

		int x = add(1, 2, 3.3);
		System.out.println("value of x is : " + x);

	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
