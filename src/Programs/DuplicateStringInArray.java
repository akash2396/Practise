package Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringInArray 
{

	public static void main(String[] args) 
	{
	
		String [] str= {"akash","arti","omika","shrushti","arti","kajal","omika","shrushti"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Found Duplicate String with Name= "+str[i]);
				}
			}
		}
		
		Set <String> s=new HashSet<String>();
		
		for(String name:str)
		{
			if(s.add(name)==false)
			{
				System.out.println(name);
			}
		}
		
		

	}

}
