package array_programmes;

public class FirstMaxWithourBB {

	public static void main(String[] args) 
	{
		int[]arr= {22,4,45,67,7889,22};
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("First MAx number is"+max);
		
	}

}
