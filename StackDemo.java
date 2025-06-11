public class StackDemo {
    private int[] stack;
    private int top;
    private int size;

    public StackDemo(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Check if stack is full
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        if (top >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Push element to stack
    public void push(int element) {
        if (isFull() != true) { // equivalent to !isFull()
            top = top + 1;      // increment top separately
            stack[top] = element;
            System.out.println(element + " was pushed onto the stack.");
        } else {
            System.out.println("Stack Overflow! Cannot push " + element);
        }
    }

    // Pop element from stack
    public void pop() {
        if (isEmpty() != false) { // equivalent to isEmpty() == true
            int poppedElement = stack[top];
            top = top - 1;       // decrement top separately
            System.out.println(poppedElement + " was popped from the stack.");
        } else {
            System.out.println("Stack Underflow! Cannot pop from empty stack.");
        }
    }

    // Peek top element
    public void peek() {
        if (isEmpty() != false) { // stack not empty
            System.out.println("Top element is: " + stack[top]);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop(); // to show underflow message
    }
}

