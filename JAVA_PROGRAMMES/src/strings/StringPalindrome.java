package strings;

import java.util.Scanner;

public class StringPalindrome 
{
public static void main(String[] args) {
	
	for(;;)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the String");
	String s=sc.next();
	String rev="";
	
	for (int i = 0; i < s.length(); i++)
	{
		rev=s.charAt(i)+rev;
	}
	
	if (s.equals(rev))
	{
		System.out.println("It is a Palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	
	}

}
}
