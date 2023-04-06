package layoff;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList(); // string array list
		mylist.add("Hitesh");
		mylist.add("Rajesh");
		mylist.add("Bhavesh");

		for (String names : mylist) {

			System.out.println(names);

		}

		System.out.println(mylist.contains("Rajesh"));

		ArrayList<Integer> myintlist = new ArrayList<Integer>(); // integer array list
		myintlist.add(1);
		myintlist.add(2);
		myintlist.add(4);

		for (int numbers : myintlist) {

			System.out.println(numbers);
		}
		System.out.println(myintlist.contains(10));
	}

}
