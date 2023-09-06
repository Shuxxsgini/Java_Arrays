import java.util.*;
public class OccurrenceOfX
 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int b= sc.nextInt();
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(a[j]==b)   //position of element
            {
                count++;
            }
        }   
        System.out.println("Occurence is: "+count);
        sc.close();
    }

}