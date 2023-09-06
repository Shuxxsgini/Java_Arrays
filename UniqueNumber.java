/*
 * Find unique number in a given array where all the elements are being
 *  repeated twice with one value being unique.
 */
import java.util.*;
public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//size
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		//input
		System.out.println("Enter Elements of array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//output
		
		for(int i=0;i<n;i++)			
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=-1;
					a[j]=-1;
				}
			}
		}
		int ans=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				ans=a[i];
			}
		}
		System.out.println("Occurence of unique number is: "+ans);		
        sc.close();
	}

}
