import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {

    public static int binarySearch(int[] array, int n, int key) {
        int lb = 0;
        int ub = n - 1;

        while (lb <= ub) {
            int mid = (lb + ub) / 2;

            if (array[mid] == key) {
                return mid; 
            } else if (array[mid] < key) {
                lb = mid + 1; 
            } else {
                ub = mid - 1; 
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array before binary search
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.print("Enter the key to search: ");
        int key = scanner.nextInt();

        int result = binarySearch(array, n, key);

        // Print result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
