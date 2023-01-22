package strings;

public class Swap1standLastVariableinaString {

	public static void main(String[] args) {

		String st = "i am from SDETT44 batch";
		String[] s = st.split(" ");
		
		//String firV = s[0];
		//String lastV=s[s.length-1];
		String a=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=a;
		
		
		for (String string : s) 
		{
			System.out.print(string+" " );
		}
		
		
		
	}

}
