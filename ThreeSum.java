/*
 * Find the total numbers of pair in the array whose sum 
 * equals to the given value x.
 */
import java.util.Scanner;
public class ThreeSum {

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
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+2;k<n-1;k++) 
				{
					if(a[i]+a[j]+a[k]==x)
					{
						ans++;
					}

				}
			}
		}
		System.out.printf("Total num of Sum is: "+ans);
		sc.close();
	}

}
