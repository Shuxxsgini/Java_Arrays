/*
 * Quest-Sorting an array by parity i.e. even numbers to odd numbers
 * 
 * 
 */
import java.util.Scanner;

public class SortArrayByParity {

    void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    void TwoPointerSort(int a[]) {
        int n = a.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (a[left]%2 == 1 && a[right]%2 == 0) {
                swap(a, left, right);
                left++;
                right--;
            }

            if (a[left]%2 == 0) {
                left++;
            }
            if (a[right]%2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortArrayByParity obj = new SortArrayByParity();
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        // Create an array to store user input
        System.out.println("Enter " + n + " elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        obj.TwoPointerSort(a);
        System.out.println("Sorted Array:");
        for (int num : a) {
        System.out.print(num + " ");
        }
        sc.close();
    }
}
