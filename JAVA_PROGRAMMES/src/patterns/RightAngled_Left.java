package patterns;

public class RightAngled_Left {

	public static void main(String[] args)
	{
		String star="*";
		int n = 1;

		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j <n; j++) 
			{
				System.out.print(star);
			}
			n++;
			System.out.println();
		}




		int nj=10;

		for (int i = 1; i < nj; i++) 
		{

			for (int j = 1; j <=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}







	}

}
