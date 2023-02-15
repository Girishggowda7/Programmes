
package miscellaneous;

import java.util.Iterator;

public class Strong_Number 
{
public static void main(String[] args) {
	
	int number=121;
	int temp=number;
	int out=0;
	
	while(number!=0)
	{
		int rem = number%10;
		int fact = 0;
		
		for (int i = 0; i < rem; i++) {
			
			fact=fact*i;
		}
		
		out=fact+out;
		number=number/10;
	}
	
	System.out.println(out);
	
	
	
}
	
	
}
