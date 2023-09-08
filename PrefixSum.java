/*
 * Using two Pointer
 */

import java.util.*;

public class PrefixSum {
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    int[] PrefixSum(int a[]) {
        int n = a.length;
        a[0] = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + a[i];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrefixSum obj = new PrefixSum();
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Create an array to store user input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] pref = obj.PrefixSum(a); // Calculate the prefix sum and store it in 'pref'
        System.out.println("Prefix Sum:");
        printArray(pref); // Print the prefix sum array
        sc.close();
    }
}
