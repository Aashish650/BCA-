import java.util.Scanner;

public class FibonacciSeriesDemo
{
    public static void main(String[] args) 
    {
        int a=0;
        int b=1;
        System.out.println("Enter the number of terms ");
        Scanner obj= new Scanner(System.in);
        int terms= obj.nextInt();
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for(int i=2;i<terms;i++)
        {
            int next = a+b;
            System.out.print(", " + next);
            a=b;
            b=next;
        }
        System.out.println();
    }
}
