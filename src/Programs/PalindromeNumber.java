package Programs;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		
		int temp = no;
		int rev = 0;
		int rem;

		while (temp != 0) 
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		System.out.println(rev);

		if (no == rev) 
		{
			System.out.println("Palindrome");
		} else 
		{
			System.out.println("Not a Palindrome");
		}
	}

}
