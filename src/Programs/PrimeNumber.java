package Programs;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int no=2;
		int temp=0;
		
		for(int i=2;i<no;i++) 
		{
			
			if(no%i==0) 
			{
				temp=temp+1;
			}
			
		}
		
			if(temp>0)
			{
				System.out.println("Number is Not Prime Number");
			}
			else
			{
				System.out.println("Number is Prime Number");
			}
		
		
		
		
	}

}
