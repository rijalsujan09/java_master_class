package java1;

public class PrintfMethod {
	public static void main(String arg[]) {

		boolean myBool = true;
		char myChar = '@';
		int myInt = 50;
		String myStr = "Sujan";
		double myDouble = 1000.985855487;

		System.out.printf("%d This is a format string", 123);

		System.out.printf("%b \n", myBool);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myStr);
		System.out.printf("%d \n", myInt);
		System.out.printf("%f \n", myDouble);
		
		System.out.printf("Hello %10s \n", myStr);
		
		System.out.printf("You have this much money %.3f \n", myDouble);
		
		System.out.printf("You have this much money %,f \n", myDouble);
	}
}
