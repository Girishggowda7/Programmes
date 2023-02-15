package strings;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountTheNumberOfVowelsInAStringWithoutDuplicates {

	public static void main(String[] args) 
	{
		for(;;)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] st = s.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for ( Character ch : st) {
			
			hs.add(ch);
		}
		
		int count=0;
		
		for (Character cha : hs) {
			
			if(cha=='a'|cha=='e'|cha=='i'|cha=='o'|cha=='u')
			{
				count++;
				System.out.print(cha);
			}
			
		}
		System.out.println("="+count);
		}
	}

}
