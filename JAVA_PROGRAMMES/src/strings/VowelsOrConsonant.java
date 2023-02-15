package strings;

public class VowelsOrConsonant 
{
	static void VorC(char y)
	{
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
		{
			System.out.println("It is a Vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}
	}
	
	
public static void main(String[] args)
{
	
	
	VorC('m');
	
	
}
}
