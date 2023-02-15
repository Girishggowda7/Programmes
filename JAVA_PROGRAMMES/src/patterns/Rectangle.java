package patterns;

public class Rectangle 
{
public static void main(String[] args) 
{

	String star="*";
	int length=5;
	int breadth=15;
	
	
	for (int i = 0; i < length; i++)
	{
		for (int j = 0; j < breadth; j++)
		{
			System.out.print(star);
			
		}
		System.out.println();
	}
	
}
}
