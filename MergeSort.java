import java.util.Scanner;

public class MergeSort {

    // Reusable temp array for merges
    static int[] b;

    public static void mergeSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

    public static void merge(int[] a, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        // Merge while both halves have elements
        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }

        // Copy remaining left half if any
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining right half if any
        while (j <= ub) {
            b[k] = a[j];
            j++;
            k++;
        }

        // Copy back merged elements to original array using i
        for (int m = lb; m <= ub; m++) {
            a[m] = b[m];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        b = new int[n];  // create temp array once

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        printArray(a);

        mergeSort(a, 0, n - 1);

        System.out.println("After Sorting:");
        printArray(a);

        sc.close();
    }

    public static void printArray(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
