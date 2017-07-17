import java.util.Scanner;

public class PermutationOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of degits to permutate");
		int n = sc.nextInt();

		int numbers[] = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		permutate(numbers, n);

	}

	private static void permutate(int[] numbers, int n) {
		// TODO Auto-generated method stub

		if (numbers.length == 0) {
			return;
		}
		

	}

}
