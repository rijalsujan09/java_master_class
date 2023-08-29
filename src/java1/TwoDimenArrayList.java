package java1;

import java.util.ArrayList;

public class TwoDimenArrayList {
	public static void main(String args[]) {

		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("Pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("pepper");

		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");

		ArrayList<String> drinkList = new ArrayList<>();
		drinkList.add("soda");
		drinkList.add("coffee");
		drinkList.add("coke");

		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinkList);

		System.out.println(groceryList);

	}
}
