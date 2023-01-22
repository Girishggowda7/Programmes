package strings;

public class ReverseTheGivenWords 
{
	public static void main(String[] args) {
		
		String st = "i am from SDETT44 batch";
		String[] s = st.split(" ");
		
		
		for (int i = s.length-1; i >=0; i--)
		{
			System.out.print(s[i]+" ");	
		}
		System.out.println("");
		
		
		
		
		for (int i = st.length()-1; i >=0; i--)
		{
		System.out.print(st.charAt(i));
			
		}
		
		
	}
	
}
