package MyPractise;

public class FirstProgram {

	public static void main(String[] args) {
	
		//Palindrome Number
//		int a=0;
//		int b=1;
//		
//		for(int i=1;i<=10;i++)
//		{
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		//Prime Number
		
		int a=7;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
			}
		}

		
		
	}

}
