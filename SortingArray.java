/*
 Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

 */
import java.util.*;
public class SortingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter Size of the Array: ");
		int size=sc.nextInt();
		//input for values
		int num[]=new int[size];
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		
		boolean isAscending=true;  // to check if the numbers are in ascending order
		
		for(int i=0; i<num.length-1; i++) //  numbers.length - 1 as termination condition
		{ 
	           if(num[i] > num[i+1]) // This is the condition for descending order
	           { 
	               isAscending = false;
	           }
	     }


	       if(isAscending) {
	           System.out.println("The Array is sorted in ascending order");
	       } else {
	           System.out.println("The Array is not sorted in ascending order");
	       }

		
        sc.close();
	}

}
