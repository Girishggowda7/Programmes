package strings;

import java.util.Scanner;

public class CountTheNumberOfVowelsInAStringWithDuplicates {

	public static void main(String[] args) 
	{
//		String s="India";
//		String sl = s.toLowerCase();
//		int count=0;
//		for (int i = 0; i < s.length(); i++) 
//		{
//			if (sl.charAt(i)=='a' || sl.charAt(i)=='e'||sl.charAt(i)=='i'||sl.charAt(i)=='o'||sl.charAt(i)=='u') 
//			{
//				count++;	
//			}	
//		}
//		System.out.println(count);
//		
		
		
		for(;;)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sring");
		String s = sc.next();
		char[] st = s.toCharArray();
		int count=0;
		
		for (int i = 0; i < st.length; i++) {
			
			if (st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u') 
			{
				count++;
				System.out.print(st[i]);
			}
			
			
		}
		
		System.out.print("="+count);
		}
		

	}

}
