import java.util.Scanner;

public class LargestandSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the dataset
        System.out.print("Enter the number of elements in the dataset: ");
        int n = scanner.nextInt();

        // Create an array to hold the dataset
        int[] dataset = new int[n];

        // Input the elements of the dataset
        System.out.println("Enter the elements of the dataset:");
        for (int i = 0; i < n; i++) {
            dataset[i] = scanner.nextInt();
        }

        // Initialize largest and smallest with the first element
        int largest = dataset[0];
        int smallest = dataset[0];

        // Iterate through the dataset to find the largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (dataset[i] > largest) {
                largest = dataset[i];
            }
            if (dataset[i] < smallest) {
                smallest = dataset[i];
            }
        }

        // Output the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
