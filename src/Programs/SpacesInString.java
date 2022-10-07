package Programs;

public class SpacesInString {

	public static void main(String[] args) {
		
		String str="a k a s h";
		int spaceCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spaceCount++;
			}
		}
		System.out.println(spaceCount);
	}

}
