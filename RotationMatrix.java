/*In this we'll rotate the array 90 degree.
 * 
 */
import java.util.*;
public class RotationMatrix {
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
	
	static void reverseArray(int[] a) {
		int i=0 ,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

	static void Rotation(int[][] mat, int n){
		//transpose first
		//then reverse each row of transpose matrix
		Transpose(mat,n,n);
          //reverse
		for(int i=0;i<n;i++) {
			reverseArray(mat[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter num of rows: ");
		 int r=sc.nextInt();
		 System.out.print("Enter num of columns: ");
		 int c=sc.nextInt();	
		 int[][] mat=new int[r][c];
			int a[][]=new int[r][c];//total=r*c			
			//input 
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					a[i][j]=sc.nextInt();  
					}
	        }
       Rotation(mat,r);
       printArray(a);
	}

}
