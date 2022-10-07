package sample;

public class Practise2 {

	public static void main(String[] args) {

		
		String input = "Akash1234Sagar5678Siddhant910#$%^^%^&^4";
		//AkashSagarSiddhant12345678910#$%^^%^&^4
		
		String s1=input.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		String s2=input.replaceAll("[^0-9]", "");
		System.out.println(s2);
		String s3=input.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s3);
		System.out.println(s1+s2+s3);
		System.out.println(s2);
		int no=Integer.parseInt(s2);
		
		int temp=no;
		int rem=0;
		int sum=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		
		System.out.println(sum);
		
		
		
		

	}

}
