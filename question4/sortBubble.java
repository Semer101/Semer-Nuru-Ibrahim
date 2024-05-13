package question4;

public class sortBubble {

	public static void main(String[] args) {
		

	}

	void bubblesort(int[] bubble) {
		 for(int i = bubble.length - 1; i >= 0; i--) {
		 for(int j = 0; j < i; j++) {
		 //do swap adjacent files after comparison
		 if(bubble[j] > bubble[j + 1]) {
		 int temp = bubble[j];
		 bubble[j] = bubble[j + 1];
		 bubble[j + 1] = temp;
		 }
		 }
		 }
		 
		 }

}
