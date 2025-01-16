package Stacks;

public class StaticStack {
    protected int[] data;  // This can now be inherited by subclasses
    protected int top = -1;
    private static final int default_size = 10;

    public StaticStack() {
        this(default_size);
    }

    public StaticStack(int size) {
        this.data = new int[size];
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == data.length - 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to push an element onto the stack
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        data[++top] = item;
        return true;
    }

    // Method to pop an element from the stack
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        int removed = data[top];
        top--;
        return removed;
    }

    // Method to peek the top element
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek into empty stack");
        }
        return data[top];
    }
    public static void main(String[] args) throws Exception {
        StaticStack newStack = new StaticStack();
        newStack.push(12);
        System.out.println(newStack.peek());
    }
    
}
//This is Static Stack Implementation.