package java1;

public class JavaMethods {
	public static void main(String args[]) {
		String name = "Sujan Rijal";
		int age = 25;
		hello(name, age);

		int x = add(5, 4);
		System.out.println("value of x is : " + x);
	}

	static void hello(String name, int age) {
		System.out.println("Hello " + name + "\nYou'r age is " + age);
	}

	static int add(int x, int y) {
		return x + y;
	}

}
