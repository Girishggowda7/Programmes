package array_programmes;

public class AdditionofTwoArrays {

	public static void main(String[] args) 
	{
		int[]arr= {2,1,3,4,2};
		int[] brr= {3,4,1,5};

		int length=arr.length;

		if(arr.length<brr.length)
		{
			length=brr.length;
		}

		for (int i = 0; i <length; i++) {


			try {

				System.out.println(arr[i]+brr[i]);

			} catch (Exception e) {

				if (arr.length<brr.length)
				{

					System.out.println(brr[i]);

				}
				else
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
