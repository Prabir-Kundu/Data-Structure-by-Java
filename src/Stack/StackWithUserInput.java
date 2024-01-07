package Stack;

import java.io.*;

public class StackWithUserInput {
    private static final int MAX_ITEM = 5;
    private int array[];
    private int top;

    StackWithUserInput(){
        array = new int[MAX_ITEM];
        top = -1;
    }

    private void push(int value){
        if(top < MAX_ITEM-1){
            array[++top] = value;
            System.out.println(value+" is inserted into the stack.");
        } else {
            System.out.println("Stack is overflow,the value is not inserted.");
        }
    }

    private void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println(array[top--]+" is remove");
    }

    private void peek(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top: "+array[top]);
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private int size(){
        return top+1;
    }

    private static void stackOperation(StackWithUserInput stack) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Option: \n1.Push \n2.Pop \n3.Peek \n4.Check Stack is empty or not. \n5.Size  \n6.Exit");
        System.out.println("Choose your option: ");
        int choice = Integer.parseInt(reader.readLine());

        switch(choice){
            case 1:
                System.out.println("Enter your value: ");
                int value = Integer.parseInt(reader.readLine());
                stack.push(value);
                break;
            case 2:
                stack.pop();
                break;
            case 3:
                stack.peek();
                break;
            case 4:
                if (stack.isEmpty()){
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Stack is not empty.");
                }
                break;
            case 5:
                System.out.println("The size of the stack is: "+stack.size());
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong option.");
                stackOperation(stack);
        }
        stackOperation(stack);
    }

    public static void main(String[] args) throws IOException {
        StackWithUserInput stack = new StackWithUserInput();

        stackOperation(stack);
    }
}
