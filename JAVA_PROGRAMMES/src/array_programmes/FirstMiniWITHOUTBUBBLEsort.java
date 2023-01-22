package array_programmes;

public class FirstMiniWITHOUTBUBBLEsort {

	public static void main(String[] args) 
	{
		int[]arr= {10,3,5,7,8,5,3};
		int mini=arr[0];
		
		for (int i = 0; i < arr.length; i++)
		{
		
			if(arr[i]<mini)
			{
				mini=arr[i];
			}
			
			
		}
		
		System.out.println(mini);
		

		
	}

}
