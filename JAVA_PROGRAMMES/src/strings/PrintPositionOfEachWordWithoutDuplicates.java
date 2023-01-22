package strings;

import java.util.LinkedHashSet;

public class PrintPositionOfEachWordWithoutDuplicates
{

	public static void main(String[] args) {
		
		String st = "i am am from a SDET44 batch";
		String[] s = st.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < s.length; i++) {
			
			set.add(s[i]);
		}
		
		for (String str : set) 
		{
			
			for (int i = 0; i < s.length; i++) {
				
				
				
			}
			
		}
		
		
	}
}
