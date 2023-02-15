package miscellaneous;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		for (int j = 0; j < 100; j++)
		{
			
	
		int num=j;
		int count=0;
		
		for (int i =2; i < num; i++) 
		{
		
			if(num%i==0)
			{
				//System.out.println("It is not A Prime");
				count++;
				break;
			}
		}
		
		if (count==0)
		{
			System.out.println(j+"   It is a Prime");
		}
		
		}	
		
	}
}
