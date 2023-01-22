package strings;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateInaString
{
public static void main(String[] args) {
	
	String st="Tester";
	String s= st.toLowerCase();
	
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	
	
	for (int i = 0; i < s.length(); i++) 
	{
	set.add(s.charAt(i));
		
	}
	
	for (Character character : set) {
		
		System.out.print(character+" ");
	}
	
	
}
	
}
