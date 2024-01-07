package Stack;

/**
 * TODO: What is Stack?
 * Answer: A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle. it has only one
 * pointer called the top that points to the topmost element of the stack. Whenever an element is added into a stack
 * it is always added at the top of the stack and when an element is deleted from the stack it always deletes from
 * the top of the stack.
 *
 * A stack typically supports two main operations:-
 * 1) Push: Adds an element to the top of the stack.
 * 2) Pop: Removes the element from the top of the stack.
 *
 * Additionally, there is often an operation called Peek or Top, which allows you to view the element at the top
 * of the stack without removing it.
 *
 * */

class Stack {
    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] array;

    public Stack() {
        this.top = -1;
        this.array = new int[MAX_SIZE];
    }
    // Use to add element in the top of the stack
    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack.Stack Overflow. Cannot push " + item);
            return;
        }
        array[++top] = item;
        System.out.println(item + " pushed to the stack");
    }

    // Use to delete element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack.Stack Underflow. Cannot pop from an empty stack.");
            return -1; // Or throw an exception
        }
        int poppedItem = array[top--];
        System.out.println(poppedItem + " popped from the stack");
        return poppedItem;
    }

    // use to print topmost element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack.Stack is empty. Cannot peek.");
            return -1; // Or throw an exception
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
