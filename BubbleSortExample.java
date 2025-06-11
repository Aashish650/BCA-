import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);

        // Input: array size
        System.out.print("Enter number of elements: ");
        int n = bs.nextInt();

        int[] arr = new int[n];

        // Input: array elements
        System.out.println("Enter the elements for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = bs.nextInt();
        }

        // Bubble Sort (simple version)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output: Sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        bs.close();
    }
}
