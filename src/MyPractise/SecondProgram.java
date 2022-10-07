package MyPractise;

public class SecondProgram {

	public static void main(String[] args) {
		
		String str = "my name is akash shingavi";
		char ch[]=str.toCharArray();
		int spaceCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spaceCount++;
			}
		}
		
		System.out.println(spaceCount+1);
	}
	
	

}
