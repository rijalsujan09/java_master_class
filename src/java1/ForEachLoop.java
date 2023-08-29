package java1;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String arg[]) {

//		String[] animals = { "cat", "dog", "rat", "bird" };
		List<String> animals = List.of("cat", "dog", "rat", "bird");

		for (String i : animals) {
			System.out.println(i);
		}
	}
}
