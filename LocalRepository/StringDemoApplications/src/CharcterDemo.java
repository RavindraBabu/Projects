import java.util.Scanner;

public class CharcterDemo {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of charachters");
		String str = sc.nextLine();
		int n = str.length();

		char ch[] = new char[n];

		for (int i = 0; i < n; i++)
		{
			ch[i] = str.charAt(i);
		}
		
		System.out.print("The string riverse is: = ");
		for(int i=n-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
	}

}
