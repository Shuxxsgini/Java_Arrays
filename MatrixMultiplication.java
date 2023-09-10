import java.util.*;
public class MatrixMultiplication {
	static void printArray(int a[][])	{
		for(int i=0;i<a.length;i++) {//row					
			for(int j=0;j<a[i].length;j++){ //column			
				System.out.print(a[i][j]+" ");
				}
		    System.out.println();
		}
	}
	
	static void mul(int a[][],int r1,int c1, int b[][], int r2,int c2 )	{
		if(c1!=r2) {
			System.out.println("Invalid");
			return;
		}
		int mul[][]=new int[r1][c2];
		for(int i=0;i<r1;i++) {  //row
			for(int j=0;j<c2;j++) {  //col
				for(int k=0;k<c1;k++) {    //to run a loop to multiply
					mul[i][j]+=(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("Multiplication of Two Matrices...");
		printArray(mul);
	}

	public static void main(String[] args) {
		//first Matrix
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter num of rows: ");
		 int r1=sc.nextInt();
		 System.out.print("Enter num of columns: ");
		 int c1=sc.nextInt();		 
			int a[][]=new int[r1][c1];//total=r*c			
			//input 
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					a[i][j]=sc.nextInt();  
					}
			       }
			
			//Second matrix
			System.out.print("Enter num of rows: ");
			 int r2=sc.nextInt();
			 System.out.print("Enter num of columns: ");
			 int c2=sc.nextInt();
			 int b[][]=new int[r2][c2];//total=r*c
				//input 
				for(int i=0;i<r2;i++){
					for(int j=0;j<c2;j++){
						b[i][j]=sc.nextInt();  
			     }
				}
			mul(a,r1,c1 ,b,r2,c2);

	}

}
