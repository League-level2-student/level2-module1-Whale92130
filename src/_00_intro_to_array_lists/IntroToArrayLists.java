package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> shapes = new ArrayList<String>();
		//2. Add five Strings to your list
		shapes.add("Rectange");
		shapes.add("Circle");
		shapes.add("Square");
		shapes.add("Triangle");
		shapes.add("hexagon");
		//3. Print all the Strings using a standard for-loop
		for (int o = 0; o<5; o++) {
			System.out.println(shapes.get(o));
		}
		System.out.println(shapes.size());
		//4. Print all the Strings using a for-each loop
		for(String s : shapes) {
			System.out.println(s);
		}
		System.out.println(" ");
		//5. Print only the even numbered elements in the list.
		for (int o = 0; o<5; o++) {
			if (o%2 == 0) {
				System.out.println(shapes.get(o));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int o = 4; o>0; o--) {
			System.out.println(shapes.get(o));
		}
		System.out.println(" ");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int o = 0; o<5; o++) {
			if(shapes.get(o).contains("e")) {
				System.out.println(shapes.get(o));
			}
		}
	}
}
