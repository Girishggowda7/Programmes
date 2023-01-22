package strings;

import java.util.LinkedHashSet;

public class CountTheDuplicateWordsInTheString 
{
	public static void main(String[] args) {
		
		String st = "i am am from from SDETT44 batch";
		String[] s = st.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		
		for (String str : s)
		{
			set.add(str);			
		}
		
		
		for (String str : set) 
		{
			int count = 0;
			for (int i = 0; i < s.length; i++)
			{
				if(str.equals(s[i]))
				{
					count++;
				}				
			}
			
			if (count>1) {
				System.out.println(str+" is Duplicated");

			}

		}

		
		
		
		
		
	}
	
}
