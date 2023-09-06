import java.util.*;
public class CloneArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		//input
		System.out.println("Enter 5 elements in array: "+" ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//output
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Accpeted Array elements are: ");
			System.out.println(a[i]);
		}
		
		
		int[] a2=a.clone();    //for clone
		a2[0]=3;
		a2[1]=4;
		for(int j=0;j<a2.length;j++) 
		{
			System.out.println("Array 2 is(Clone): "+a2[j]);
		}
		
		
		//changing some values in array 2
		
		sc.close();
	}

}
