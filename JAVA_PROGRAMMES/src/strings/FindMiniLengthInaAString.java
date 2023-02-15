package strings;

public class FindMiniLengthInaAString
{

	public static void main(String[] args)
	{
		String[] s= {"ab","abcd","a","abc"};
		String d="";

		for (int i = 0; i < s.length; i++) 
		{
			for (int j = 1; j < s.length; j++)
			{
				if(s[i].length()>s[j].length())
				{
					d=s[j];
				}
			}		
		}
		System.out.println(d+" is mini");


		
	}

}
