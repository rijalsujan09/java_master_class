package java1;

public class StringInJava {
	public static void main(String args[]) {
		String name = "suJan";
		String txt = "txt";

		boolean result1 = name.equals("sujan");
		boolean result2 = name.equalsIgnoreCase("SUJAN");
		
		
		

		System.out.println(result1);
		System.out.println(result2);

		System.out.println("length of name : " + name.length());

		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("S"));
		
		boolean result3 = txt.isEmpty();
		System.out.println(result3);
		System.out.println(txt.isBlank());
		

	}
}
