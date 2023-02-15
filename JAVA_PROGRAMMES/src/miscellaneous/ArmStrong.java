package miscellaneous;

public class ArmStrong {

	public static void main(String[] args)
	{
		for (int i = 0; i < 10000; i++) 
		{		
		int num=i;
		int copy=num;
		int out=0;
		int length=String.valueOf(copy).length();
		while(num!=0)
		{
			int rem=num%10;

			out=out+(int)Math.pow(rem, length);
			num=num/10;
		}
		
		if(copy==out) System.out.println(out);
		
		}
	}

}
