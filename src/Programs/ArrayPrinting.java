package Programs;

public class ArrayPrinting {

	public static void main(String[] args) {

		int [][] a = {{10,20,30,40,50},{400,300,200,100}};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		

	}

}
