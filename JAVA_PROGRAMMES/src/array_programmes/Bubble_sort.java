package array_programmes;

public class Bubble_sort 
{

	public static void main(String[] args) 
	{
		int[]arr= {6,0,2,0,1};

		for(int i=0;i<arr.length;i++)
		{
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+", ");
		}
	}
}
