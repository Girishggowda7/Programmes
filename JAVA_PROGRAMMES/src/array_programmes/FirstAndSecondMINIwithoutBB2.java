package array_programmes;

public class FirstAndSecondMINIwithoutBB2 
{
	public static void main(String[] args) {
		int[]arr= {1,1,1,2,2,2342,3454,657,768,79980,1,1,34,2,456,78,99,};
		int fMini=arr[0];
		int sMini=arr[1];


		for (int i = 0; i < arr.length; i++) 
		{

			if(fMini>=arr[i])
			{

				if (fMini!=arr[i])
				{
					sMini=fMini;	
				} 
				fMini=arr[i];
			}
			else if (fMini==sMini || sMini>=arr[i])
			{
				sMini=arr[i];	
			}
		}

		System.out.println("First MINI==="+fMini);
		System.out.println("Second MINI==="+sMini);

	}

}
