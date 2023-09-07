import java.util.Scanner;

public class TwoPointerSortSquare {

    void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    void TwoPointerSort(int a[]) {
        int n = a.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0; // Start from the beginning of the ans array

        while (left <= right) {
            int leftSquare = a[left] * a[left];
            int rightSquare = a[right] * a[right];

            if (leftSquare <= rightSquare) {
                ans[k++] = leftSquare;
                left++;
            } else {
                ans[k++] = rightSquare;
                right--;
            }
        }

        // Copy the sorted values from ans back to the original array a
        for (int i = 0; i < n; i++) {
            a[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoPointerSortSquare obj = new TwoPointerSortSquare();
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        // Create an array to store user input
        System.out.println("Enter " + n + " elements:");
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
