package strings;

public class SegregateAlphabetsNumSpecialChar 
{

	public static void main(String[] args) {
		
		String s="a2Bc%4&d";
		String alphabets="";
		String numbers="";
		String splChar="";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>'A' && s.charAt(i)<'z')
			{
				alphabets=s.charAt(i)+alphabets;
			}
			else if(s.charAt(i)>'0' && s.charAt(i)<'9')
			{
				numbers=s.charAt(i)+numbers;
			}
			else
			{
				splChar=s.charAt(i)+splChar;
			}
			
		}
		
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(splChar);
		
		
		
		
		
		
		
	}
	
}
