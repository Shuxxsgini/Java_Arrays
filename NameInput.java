/*Question-
 * Take an array of names as input from the user and print them on the screen.
 */
import java.util.Scanner;
public class NameInput {

	public static void main(String[] args)
	{
		//input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		//input
		String name[]=new String[size];
		System.out.print("Enter names: ");//taking values of index
		for(int i=0;i<size;i++)
		{
			name[i]=sc.next();
		}
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println((i+1)+" Name is :"+name[i]);
		}
		sc.close();
	}

}
