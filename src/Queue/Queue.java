package Queue;

public class Queue {
    int MAX_ITEM = 5;
    int[] array;
    int rear;
    int front;

    Queue(){
        array = new int[MAX_ITEM];
        rear = -1;
        front = 0;
    }

    void enqueue(int value){
        if (rear == MAX_ITEM-1){
            System.out.println("Queue is full.");
        } else {
            array[++rear] = value;
            System.out.println("Insert: "+value);
        }
    }

    void dequeue(){
        if (front > rear){
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Remove: "+array[front++]);
        }
    }

    void showFront(){
        if (front > rear){
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: "+array[front]);
        }
    }

    public static void main(String[] args){
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.dequeue();
        queue.showFront();
        queue.dequeue();
        queue.showFront();
        queue.dequeue();
        queue.showFront();
        queue.dequeue();
        queue.showFront();
        queue.dequeue();
        queue.showFront();
        queue.dequeue();
    }
}
