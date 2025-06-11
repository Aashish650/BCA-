import java.util.Scanner;

public class SelectionSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements for array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Selection sort simplified
        for (int j = 0; j < n - 1; j++) {
            int loc = j;
            int small = a[j];

            for (int i = j + 1; i <= n - 1; i++) {
                if (a[i] < small) {
                    small = a[i];
                    loc = i;
                }
            }

            // Swap a[j] and a[loc]
            int temp = a[j];
            a[j] = a[loc];
            a[loc] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
