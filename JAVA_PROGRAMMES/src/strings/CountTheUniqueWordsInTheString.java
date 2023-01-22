package strings;

import java.util.LinkedHashSet;

public class CountTheUniqueWordsInTheString 
{
public static void main(String[] args) 
{
	
	String st="i am am from a SDET44 batch";
	String[] spl = st.split(" ");
	
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	
	for (String str : spl)
	{
		set.add(str);
	}
	
	System.out.println(set.size());	
}
}
