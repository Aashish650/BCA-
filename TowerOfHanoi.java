public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi puzzle
    public static void solveTOH(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solveTOH(n - 1, source, destination, auxiliary);
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        // Move n-1 disks from auxiliary to destination
        solveTOH(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change the number of disks here
        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:");
        solveTOH(numberOfDisks, 'A', 'B', 'C');
    }
}

