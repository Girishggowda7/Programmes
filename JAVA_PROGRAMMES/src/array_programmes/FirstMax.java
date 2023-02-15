package array_programmes;

import java.util.ArrayList;

public class FirstMax {

	public static void main(String[] args) {
		int[]arr= {3,7,6,2,0,1};

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
		System.out.println("First MAX is==="+arr[0]);
		
		
		
		
		
		
		

	}

}
