package patterns;

public class NP_8 extends NP_7
{
	public static void main(String[] args) 
	{
		
		int n=9;
		int count=1;
		for (int i = 1; i < n; i++)
		{
		for (int j = 1; j <i ; j++) 
		{
			if (count<9)
			{
				System.out.print(count);
				
			} else 
			{
				System.out.print(count%10);
				
			}
			count++;
			
		}	
		System.out.println("");
		}
		
		
		
	}
}
