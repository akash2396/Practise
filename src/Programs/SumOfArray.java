package Programs;

public class SumOfArray {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40,50,60,70,80,90,100,3,5,7};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) 
			{
				System.out.print(" "+a[i]);
			}
			else
			{
				System.out.println(" "+a[i]);
			}
		}

	

}
	}
