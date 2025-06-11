import java.util.Scanner;

public class OptimizedBubblesort {
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = bs.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = bs.nextInt();
        }

        // Optimized Bubble Sort using swap count
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;  // reset swap count for this pass

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;  // increment swap counter
                }
            }

            // If no swaps occurred in this pass, array is sorted
            if (swap == 0) {
                break;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        bs.close();
    }
}
