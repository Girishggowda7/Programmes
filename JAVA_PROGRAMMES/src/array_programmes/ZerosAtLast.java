package array_programmes;

public class ZerosAtLast {

	public static void main(String[] args) 
	{
	
	int[]arr= {4,0,9,0,0};
	int[]brr=new int[arr.length];
	int m=0;
	int n=arr.length-1;
	
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]==0)
		{
			brr[m]=arr[i];
			m++;
		}
		else
		{
			brr[n]=arr[i];
			n--;
		}
	}
	
	for (int i = 0; i < brr.length; i++) {
		
		System.out.print(brr[i]+" ");
	}
	
	
	
	}

}
