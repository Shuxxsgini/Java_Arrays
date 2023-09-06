/*
 * Find the total numbers of pair in the array whose sum 
 * equals to the given value x.
 */
import java.util.Scanner;
public class TwoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of Array:  ");
	    for(int m=0;m<n;m++)
	    {
	    	a[m]=sc.nextInt();
	    }
	    System.out.println("Target number: ");
		int x=sc.nextInt();
		int ans=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==x)
				{
					ans++;
				}
			}
		}
		System.out.printf("Postion is: "+ans);
		sc.close();
	}

}
