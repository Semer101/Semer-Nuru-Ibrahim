package question6;

public class arrayEdit {

	public static void main(String[] args) {
		
		int[] array = {3, 7, 1, 9, 4};
		deleteElement(array, 2);
	}
		public static void deleteElement(int[] array, int index) {
			if (index < 0 || index >= array.length) {
				System.out.println("Invalid index.");
				for(int element : array) {
					System.out.println(element);
				}
			}
			int indexToDelete = index;
			int[] newArray = new int[array.length - 1];
			for (int i = 0, j = 0; i < array.length; i++) {
			 if (i != indexToDelete) {
			 newArray[j++] = array[i];
		    }
		}
	}
}
	