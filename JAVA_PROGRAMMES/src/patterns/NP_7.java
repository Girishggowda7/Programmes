package patterns;

public class NP_7
{

	public static void main(String[] args) 
	{

		int n=9;

		for (int i = 1; i <=n; i++)
		{
			for (int j=0; j <i; j++) 
			{
				System.out.print(" ");
			}
			for (int j = i; j <=n; j++) 
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

	}
}
