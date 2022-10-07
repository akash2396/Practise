package Programs;

public class CountOfEvenOddOfNumber {

	public static void main(String[] args) {
		
		int num = 123456789;
		int temp=num;
		int rem;
		int evenCount = 0;
		int oddCount = 0;
		
		while(temp!=0)
		{
			rem=temp%10;
			
			if(rem%2==0)
			{
				evenCount++;	
			}
			else
			{	
				oddCount++;	
			}
			
			temp =temp/10;
			
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
		

	}

}
