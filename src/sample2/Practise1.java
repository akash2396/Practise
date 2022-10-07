package sample2;

public class Practise1 {

	public static void main(String[] args) {
	
		String input="Ak123a@##$%^^^sh456";
		//Akash123456a@##$%^^^
		
		String s1=input.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		String s2=input.replaceAll("[^0-9]","");
		System.out.println(s2);
		String s3=input.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s3);
		System.out.println(s1+s2+s3);
		int a=Integer.parseInt(s2);
		int temp=a;
		int sum=0;
		int rem=0;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		
		
		System.out.println(sum);
		
	}

}
