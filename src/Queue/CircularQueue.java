package Queue;

public class CircularQueue {
    int maxSize;
    int[] queue;
    int front;
    int rear;

    CircularQueue(int size) {
        maxSize = size+1;
        queue = new int[maxSize];
        front = 0;
        rear = 0;
    }

    private boolean isEmpty(){
        return front == rear;
    }

    private boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    private void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full. "+item+" is not inserted.");
        } else {
            queue[rear] = item;
            rear = (rear + 1) % maxSize;
            System.out.println("Enqueue: "+item);
        }
    }

    private void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
        } else {
            int item = queue[front];
            front = (front + 1) % maxSize;
            System.out.println("Dequeue: "+item);
        }
    }

    private void display(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is: ");
            int i = front;
            while (i != rear){
                System.out.print(queue[i]+" ");
                i = (i + 1) % maxSize;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);

        cq.display();

        cq.dequeue();
        cq.dequeue();
        cq.dequeue();

        cq.enqueue(60);
        cq.enqueue(70);
        cq.enqueue(80);

        cq.display();
    }
}
