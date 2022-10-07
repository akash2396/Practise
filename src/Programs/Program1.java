package Programs;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		
		int [] arr= {10,20,30,10,10,40,50};
		
		Set<Integer> s= new HashSet<>();
		
		for(int no:arr)
		{
			if(s.add(no)==false)
			{
				System.out.println(no);
			}
		}

	}

}
