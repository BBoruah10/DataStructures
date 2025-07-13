class Stack {
    private int maxSize;
    private int[] stackArr;
    private int top;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArr = new int[maxSize];
        top = -1; // empty stack
    }

    // Push operation
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArr[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArr[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }
}

public class Stacky {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Output: Stack: 30 20 10

        System.out.println("Top element: " + stack.peek());  // Output: 30

        System.out.println("Popped: " + stack.pop());  // Output: 30

        stack.display();  // Output: Stack: 20 10
    }

  
}
