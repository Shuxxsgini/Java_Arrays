import java.util.Scanner;

public class PascalTriangle {

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        System.out.println("Enter The Row");
        int row = s.nextInt();
        int mat1[][] = new int[row][];
        for (int i = 0; i < mat1.length; i++) {
            int col = i + 1;
            mat1[i] = new int[col];

            for (int j = 0; j < mat1[i].length; j++) {
                if (i == j || j == 0) {
                    mat1[i][j] = 1;
                } 
                else {
                    mat1[i][j] = mat1[i - 1][j] + mat1[i - 1][j - 1];
                }
            }
        }
        printMatrix(mat1);
        s.close();
    }
}