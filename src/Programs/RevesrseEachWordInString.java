package Programs;

public class RevesrseEachWordInString {

	public static void main(String[] args) 
	{
		String str="akash kishor shingavi";
		
		String[] words=str.split(" ");
		
		String reverse="";
		
		for(String w:words)
		{
			String revesrseWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revesrseWord=revesrseWord+w.charAt(i);
			}
			reverse=reverse+revesrseWord+" ";
		}
		
		System.out.println(reverse);
		
		
		
		
	}

}
