package layoff;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ConverArrayToArrayList {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6 }; // Declared and initialized array
		String[] name = { "Rajesh", "Manu" };

	/*	for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				System.out.println(arr[i]);
			}

			else {

				System.out.println("not able to devide " + arr[i]);
			} 
			
		} */
		

			List<int[]> arrlist = Arrays.asList(arr); // converting int array to Array list
			System.out.println(arrlist.contains("1"));
			// System.out.println(arrlist.isEmpty());

			List<String> namelist = Arrays.asList(name); // converting string array to Array List
			System.out.println(namelist.contains("bobu"));

		}

	}


