package array_programmes;

public class MulFirst3mini 
{
public static void main(String[] args) {


	int[]arr= {3,7,6,2,5,1};

	for(int i=0;i<arr.length;i++)
	{
		for (int j = 0; j < arr.length; j++) {
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	int mul = 1;
	System.out.println("Multiply of first 3 MINi==="+(arr[0]*arr[1]*arr[2]));

	for (int i = 0; i < 3; i++) 
	{
		mul=mul*arr[i];
	}
	
	System.out.println("Multiply of first 3 MINi==="+mul);
	
	


}
}
