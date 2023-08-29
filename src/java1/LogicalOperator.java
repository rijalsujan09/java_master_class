package java1;

public class LogicalOperator {
	public static void main(String arg[]) {

		int tem = 25;
		if (tem > 30) {
			System.out.println("It is hot outside.");
		} else if (tem >= 20 && tem <= 30) {
			System.out.println("It is warm outside.");

		} else {
			System.out.println("It is cold outside.");
		}
	}
}
