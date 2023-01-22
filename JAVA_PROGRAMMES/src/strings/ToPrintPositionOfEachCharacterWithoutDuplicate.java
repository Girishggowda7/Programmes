package strings;

import java.util.LinkedHashSet;

public class ToPrintPositionOfEachCharacterWithoutDuplicate {

	public static void main(String[] args)
	{
		String st="Tester";
		String s=st.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for (int i = 0; i < st.length(); i++) {
			
			set.add(s.charAt(i));
			
		}
		
		
		for (Character character : set) {
			
			for (int j = 0; j < s.length(); j++) {
				
			
			
			if (character==s.charAt(j)) {
				System.out.println(character+ " is in "+(j+1)+ " position");
				break;
			} 
			
			
			
			}	
		}
		
		
	}

}
