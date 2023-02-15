package patterns;

public class NP_4
{
	public static void main(String[] args) 
	{

		int n=5;
		int counter = 1;

		for (int i = 1; i <=n; i++)
		{
			for (int j=0; j <i; j++) 
			{
				System.out.print(counter+" ");
				counter++;
			}
			counter=1;
			System.out.println();
		}

	}
}
