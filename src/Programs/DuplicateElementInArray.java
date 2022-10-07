package Programs;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int [] a= {40,30,40,20,10,10,40};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
