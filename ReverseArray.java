/*
 * Reverse an array consisting of integer values.
 */
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//size
		System.out.print("Enter size of Array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array: ");
		//input
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
	    }
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
       sc.close();
	}

}
