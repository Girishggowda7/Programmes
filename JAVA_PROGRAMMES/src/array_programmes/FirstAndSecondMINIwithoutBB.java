package array_programmes;

public class FirstAndSecondMINIwithoutBB 
{
public static void main(String[] args) {
	 int[]arr= {2342,3454,657,768,79980,1,1,34,456,78,99,};
	 int fMini=arr[0];
	 int sMini=arr[1];
	 
	 
	 for (int i = 0; i < arr.length; i++) 
	 {
		 
		 if(arr[i]<fMini)
		 {
			 sMini=fMini;
			 fMini=arr[i];
		 }	 
		 else if (arr[i]<sMini)
		 {
		
			 sMini=arr[i];
		}
		 
		 
		 
		 
	}
	 
	 System.out.println("First MINI==="+fMini);
	 System.out.println("Second MINI==="+sMini);
	 
}
	
}
