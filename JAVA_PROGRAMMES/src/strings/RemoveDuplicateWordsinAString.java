package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsinAString
{
	public static void main(String[] args) {
		
		String st = "i am am from SDETT44 batch";
		String[] s = st.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for (int i = 0; i < s.length-1; i++)
		{
		set.add(s[i]);		
		}
		
		for (String string : set) {
			
			System.out.print(string+" ");
			
		}
		
	}
}
