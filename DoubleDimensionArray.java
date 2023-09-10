import java.util.*;
public class DoubleDimensionArray {
	static void printArray(int a[][])
	{
		for(int i=0;i<a.length;i++) //row
		{
			for(int j=0;j<a[i].length;j++) //column
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num of rows: ");
	 int r=sc.nextInt();
	 System.out.println("Enter num of columns: ");
	 int c=sc.nextInt();
	 
		int a[][]=new int[r][c];//total=r*c
		
		//input 
		for(int i=0;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();  
			}
		}
		
		/*int a2[][]= { {2,3,4},{4,6,11},{6,2,1}};*/
        printArray(a);
        sc.close();
	}

}
