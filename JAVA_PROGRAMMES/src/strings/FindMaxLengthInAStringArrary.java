package strings;

public class FindMaxLengthInAStringArrary
{
public static void main(String[] args) {
	
	String[] arr= {"a","ab","abc","abci","kl","a"};
	String max=arr[0];
	
	for (int i = 0; i < arr.length; i++)
	{
		if(arr[i].length()>max.length())
		{
			max=arr[i];
		}
		
	}
	
	for (int i = 0; i < arr.length; i++) {
		
		
		if(max.length()==arr[i].length())
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	
	
}
	
}
