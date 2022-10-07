package Programs;

public class vowelsInString {

	public static void main(String[] args) {
		
		String str="akash shingavi";
		int vowelsCount=0;
		int consentCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowelsCount++;
			}
			else
			{
				consentCount++;
			}
		}
		
		System.out.println(vowelsCount);
		System.out.println(consentCount);

	}

}
