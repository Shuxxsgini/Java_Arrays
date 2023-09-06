import java.util.*;
public class SortZerosNOnes
{
    void SortZerosnOnes(int a[])
    {
    	int n=a.length;
    	int z=0;
    	
    	//count number of 0
    	
    	for(int i=0;i<n;i++)
    	{
    		if(a[i]==0)
    		{
    			z++;
    		}
    	}
    	
    	// 0 to z-1 :0, z to n-1: 1
    	for (int i=0;i<n;i++)
    	{
    		if(i<z)
    		{
    			a[i]=0;
    		}
    		else
    		{
    			a[i]=1;
    		}
    	}
    }
    void printArray(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        SortZerosNOnes obj = new SortZerosNOnes();
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n]; 
        // Create an array to store user input
        System.out.println("Enter " + n + " elements (0s and 1s):");

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }

        obj.SortZerosnOnes(a);
        System.out.println("Sorted Array:");
        obj.printArray(a);
        sc.close();
    }
}



