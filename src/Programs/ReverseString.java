package Programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="akash";
		System.out.println(str);
		String rev="";
		
		
		/*for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse String is= "+rev);
		*/
		
		/*char[] chr= str.toCharArray();
		
		for(int i=chr.length-1;i>=0;i--) {
			
			System.out.print(chr[i]);
		}
		*/
		
		StringBuffer st=new StringBuffer(str);
		
		System.out.println(st.reverse());

	}

}
