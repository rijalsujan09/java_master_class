package java1;

import java.util.ArrayList;

public class JavaArrayList {
	public static void main(String args[]) {

		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hot-dog");
		
		
		for(String f: food) {
			System.out.println(f);
		}
	}
}
