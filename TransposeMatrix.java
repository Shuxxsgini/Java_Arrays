/*
 * WAP to Transpose a matrix without creating other matrix
 * -So basically we have to swap the given position
 * Look at the code....
 */
import java.util.*;
public class TransposeMatrix {
	static void printArray(int a[][])	{
		for(int i=0;i<a.length;i++) {//row					
			for(int j=0;j<a[i].length;j++){ //column			
				System.out.print(a[i][j]+" ");
				}
		    System.out.println();
		}
	}

	static void Transpose(int[][] mat, int r, int c){
		int[][]ans=new int[c][r];
		for(int i=0;i<c;i++) {
			for(int j=i;j<r;j++) {
				int temp=mat[i][j];
			    mat[i][j]=mat[j][i];
			    mat[j][i]=temp;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter num of rows and columns: ");
		 int r=sc.nextInt();
		 int c=sc.nextInt();	
		 int[][] mat=new int[r][c];
			int a[][]=new int[r][c];//total=r*c			
			//input 
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					a[i][j]=sc.nextInt();  
					}
	        }
          
		Transpose(mat,r,c);
           printArray(a);
           sc.close();
	}

}
