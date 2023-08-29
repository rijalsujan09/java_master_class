package java1;

public class WrapperClass {
	public static void main(String arg[]) {

		Boolean a = true;
		Character b = '#';
		Integer c = 123;
		Double d = 1.2; 
		String e = "Bro";

		if (a == true) {
			System.out.println("This is true..");
		}
		if (!b.equals('b')) {
			System.out.println("This is true..");
		}
		if (c != 1) {
			System.out.println("This is true..");
		}
		if (d == 1.35) {
			System.out.println("This is also true..");
		}

	}
}
