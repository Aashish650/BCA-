import java.util.Scanner;

public class InsertionSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements for array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Insertion Sort simplified
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements of a[0..j-1], that are greater than key, to one position ahead
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
