package sample;

public class Practise1 {

	public static void main(String[] args) 
	{
		//Accli234567#$%^%^
		String input = "Acc#$%^2345li67%^";
		System.out.println(input);
		String s1=input.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		String s2=input.replaceAll("[^0-9]", "");
		System.out.println(s2);
		int a=Integer.parseInt(s2);
		String s3=input.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s3);
		System.out.println(s1+s2+s3);
		
	}

}
