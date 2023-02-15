package practice;

public class b 
{
	public static void main(String[] args) {

		int []arr= {2,3,7};
		for (int i = 1; i <=10; i++) 
		{
			int count=0;

			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[j]==i) 
				{
					count++;
				}
			}

			if (count==0)
			{
				System.out.println(i);	
			}
		}
	}	

}
