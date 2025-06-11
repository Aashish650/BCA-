public class SimpleQueue {
    static final int SIZE = 5;
    int[] queue = new int[SIZE];
    int f = -1, r = -1;

    // Check if queue is full
    boolean isFull() {
        if (r == SIZE - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Check if queue is empty
    boolean isEmpty() {
        if ((r == -1 && f == -1) || (f > r)) {
            return true;
        } else {
            return false;
        }
    }

    // Enqueue operation
    void enqueue(int data) {
        if (isFull() != true) {
            if (r == -1 && f == -1) {
                r++;
                f++;
            } else {
                r++;
            }
            queue[r] = data;
            System.out.println("Enqueued: " + data);
        } else {
            System.out.println("Queue is overflow.");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (isEmpty() != true) {
            int data = queue[f];
            System.out.println("Dequeued: " + data);
            f++;
        } else {
            System.out.println("Queue is underflow.");
        }
    }

    // Display the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = f; i <= r; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main to demonstrate usage
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
  
        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // This should trigger "Queue is overflow"
        q.display();
    }
}
