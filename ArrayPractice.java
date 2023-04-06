package layoff;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] array = new int[11]; // declaring array

		array[0] = 1; // Initializing array
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;
		array[10] = 11;

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);
		}

		System.out.println("*****");

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }; // declaring and initializing array

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);
		}

	}

}
