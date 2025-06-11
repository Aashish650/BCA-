
import java.util.Scanner;



public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the no.of Elements in the array");
        int n= num.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<n;i++)
        {
            array[i]=num.nextInt();

        }
        System.out.println("Enter the Key to search for it");
        int key= num.nextInt();

        int result=LinearSearch(array, n, key);
        if(result==-1){
            System.out.println("Elements not found in array");
        }
        else{
            System.out.println("Elements found in : "+result);
        }
    }
    public static int LinearSearch(int [] array,int n, int key ){
        for(int i=0;i<n;i++)
        {
            if(array[i]==key){
                return i;
            }
            
        }
        return -1;

    }
}
