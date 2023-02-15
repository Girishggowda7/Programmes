package strings;

public class SumOfDigitsInAString {
	public static void main(String[] args) {

		String s="a1b2c4";
		String su="";

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				su=s.charAt(i)+su;
			}
		}
		int ss = Integer.parseInt(su);
		int sum=0;

		while(ss!=0)
		{
			int rem = ss%10;
			sum=rem+sum;

			ss=ss/10;
		}

		System.out.println(sum);



	}
}
