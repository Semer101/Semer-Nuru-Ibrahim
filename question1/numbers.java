package question1;

public class numbers {

	public static void main(String[] args) {
	int[] array1 = {5, 4, 7, 2, 5, 8, 5, 5};
	searchArray(array1,5);
	}
	public static int searchArray(int[] arr, int element) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] == element) {
		counter++;
		}
	  }
		System.out.print("The no. was found " + counter + " times!");
	    return -1; 
  }
}

