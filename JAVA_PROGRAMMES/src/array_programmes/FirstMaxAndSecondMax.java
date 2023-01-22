package array_programmes;

public class FirstMaxAndSecondMax 
{
public static void main(String[] args) 
{
	 int[]arr= {2342,3454,657,768,79980,0,1,34,456,78,99};
	 int fMax=arr[0];
	 int sMax=arr[1];
	 
	 
	 for (int i = 0; i < arr.length; i++) 
	 {
		 
		 if(arr[i]>fMax)
		 {
			sMax=fMax;
			 fMax=arr[i];
		 }	 
		 else if (arr[i]>sMax)
		 {
		
			 sMax=arr[i];
		 }
	}
	 
	 System.out.println("First MINI==="+fMax);
	 System.out.println("Second MINI==="+sMax);
	 
}
}
