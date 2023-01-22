package strings;

public class ReverseAString {
	public static void main(String[] args) {

		String s="Bangalore";
		String o= "";

		//1.
		for (int i = 0; i < s.length(); i++) 
		{
			o=s.charAt(i)+o;

		}
		System.out.println(o);


		//2.
		for (int i = s.length()-1; i >=0; i--)
		{
			System.out.print(s.charAt(i));
			
		}
		System.out.println();

		//3.
		char[] ch = s.toCharArray();
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.print(ch[i]);
		}
		
		
		//4.
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) 
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		
	}
}
