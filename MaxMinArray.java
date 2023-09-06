/*Question:-
 * Find the maximum & minimum number in an array of integers. 
 */
import java.util.*;
public class MaxMinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		int num[]=new int[size];
		//input
		System.out.println("Enter Values in array: ");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		//output
		int max=Integer.MIN_VALUE; //to initialize the minimum variable in the array
		int min=Integer.MAX_VALUE; //to initialize the maximum variable in the array
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
				
			}
		    if(num[i]>max)
		    {
			max=num[i];
			
		    }
		
		}
		System.out.println("Maximum number is: "+max);
		System.out.println("Maximum number is: "+min);
        sc.close();
	}

}
