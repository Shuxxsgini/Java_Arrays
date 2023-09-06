/*
 * WAP to accept 9 Elements in DDA(Double Dimension Array) & print the sum of:
 * a)Sum of Left diagonal elements
 * b)Sum of Right diagonal elements
 * c)Sum of all even elements
 * d)Sum of all odd elements
 */
import java.util.*;
public class DDArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num[][]=new int[3][3];
		int total=0;
		int EvenTotal=0;
		int OddTotal=0;
		
		for(int r=0;r<=2;r++)
		{
			System.out.println("------------------");
			
			for(int c=0;c<=2;c++)
			{
				System.out.print("Enter number "+(c+1)+" : ");
				num[r][c]=sc.nextInt();
				
			
				//SUM OF LEFT DIAGONAL ELEMENTS
				
				if(r==c)
				{
					total=total+num[r][c];
				}	
				
				//SUM OF RIGHT DIAGONAL ELEMENTS
								
					
		
				
				//FOR SUM OF EVEN ELEMENT
				if(r%2==0 && c%2==0)
				{				
				EvenTotal=EvenTotal+num[r][c];			
				}
				
				
				//FOR SUM OF ODD ELEMENT
				if(r%2!=0 && c%2!=0)
				{		    
				OddTotal=OddTotal+num[r][c];		   
				}
				
				
				
			}
			
			
		}
		System.out.println("-----------------------------");
		System.out.println("Left Diagonal sum is: " + total);
		System.out.println("Sum of even is: " + EvenTotal);
		System.out.println("Sum of odd is: "+OddTotal);
		sc.close();

	}

}
