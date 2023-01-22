package strings;

public class CountNumberOfUpperCaseANDLowerCase 
{
public static void main(String[] args) {
	
	String s="BanGALore";
	int uppercase=0;
	int lowercase=0;
	
	for (int i = 0; i < s.length(); i++) {
		
		
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			uppercase++;
			
		}else if(s.charAt(i)>='a' && s.charAt(i)<='z')
		{
			lowercase++;
		}
	}
	
	System.out.println("Number of uppercase is  "+uppercase);
	System.out.println("Number of lowercase is  "+lowercase);
	
}
}
