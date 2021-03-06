public class QuickSort {

	private int array[];
	private int length;

	public void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
		
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
			
			System.out.print("pivot is "+pivot+" Array is=");
			for(int l=0;l<array.length;l++){
				System.out.print(" "+array[l]);
			}
			System.out.println(" ");
		}
		// call quickSort() method recursively
		if (lowerIndex < j){
			System.out.println("The lower index "+lowerIndex + "the j is " +j);
			quickSort(lowerIndex, j);
			
		}
			
		
		if (i < higherIndex){
			System.out.println("The higer index "+higherIndex + "the i is " +i);
			quickSort(i, higherIndex);}
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {

		QuickSort sorter = new QuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}