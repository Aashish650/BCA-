import java.util.Scanner;

public class FibonacciRecursive {

    
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  
        } else if (n == 1) {
            return 1;  
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int count = scanner.nextInt();

        System.out.println("Fibonacci series:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
