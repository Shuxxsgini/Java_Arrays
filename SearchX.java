/*LINEAR SEARCH
 * 
 * Take an array as an input from user.Search for a given number x ..
 * ..and print the index at which it occurs.
 */
import java.util.*;
public class SearchX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of Array: ");
		int size=sc.nextInt();//taking size of array from user
		int num[]=new int[size];
		System.out.println("Give the values of Array: ");//taking values of index
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		int x;//number (x) which you have to find
		System.out.print("Enter the number you want to find: ");
		x=sc.nextInt();
		for(int i=0;i<num.length;i++)//we'll run a loop to check if the number (x) exist in that array
		{
			if(num[i]==x)
			{
				System.out.println("Number found at: "+i);
			}
			sc.close();
		}
	}

}
