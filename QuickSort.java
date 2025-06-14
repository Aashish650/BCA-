import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc - 1);
            quickSort(a, loc + 1, ub);
        }
    }

    public static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            // Boundary check comes first, then value check
            while (start < ub && a[start] <= pivot) {
                start++;
            }

            while (end > lb && a[end] >= pivot) {
                end--;
            }

            if (start < end) {
                // Swap a[start] and a[end]
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        printArray(a);

        quickSort(a, 0, n - 1);

        System.out.println("After Sorting:");
        printArray(a);

        sc.close();
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
