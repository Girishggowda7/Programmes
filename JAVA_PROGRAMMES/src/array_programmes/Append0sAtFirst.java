package array_programmes;

import java.util.Iterator;

public class Append0sAtFirst {

	public static void main(String[] args) {
		
		int[] arr= {1,0,1,0,0};
		int[] brr=new int[arr.length];
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
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
		
		
		
		int[] a= {1,0,1,0,0,1,1,1};
		int[]b=new int[a.length];
		int o=0;
		int p=a.length-1;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{b[o]=a[i];
			o++;
			}
			else
			{
				b[p]=a[i];
				p--;
			}
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
		
		System.out.print(b[i]);
		}
		
		
		
		
		

}

}
