package LinkList;

import java.util.Scanner;

class NodeDouble {
    int data;
    NodeDouble next;
    NodeDouble prev;

    NodeDouble(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkList {
    NodeDouble head;

    void insertNodeAtBeginning(int data){
        NodeDouble newNode = new NodeDouble(data);
        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Element added successfully.");
    }

    void insertAtEnd(int data){
        NodeDouble newNode = new NodeDouble(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeDouble lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.prev = lastNode;
        }
    }

    void deleteNodeFromBeginning(){
        if (head == null){
            System.out.println("LinkList is empty.");
        } else {
            NodeDouble current = head;
            head = current.next;
            head.prev = null;
        }
        System.out.println("Delete successfully");
    }

    void deleteNodeFromEnd(){
        if (head == null){
            System.out.println("LinkList is empty.");
        } else {
            NodeDouble current = head;
            while (current.next.next  != null){
                current = current.next;
            }
            current.next = null;
        }
        System.out.println("Delete successfully");
    }

    void printList(){
        if (head == null){
            System.out.println("LinkList is empty.");
        } else {
            NodeDouble current = head;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("============ Double LinkList ===========");
            System.out.println("1. Insert element at beginning");
            System.out.println("2. Insert an element at end");
            System.out.println("3. Delete an element from beginning.");
            System.out.println("4. Display an element from end");
            System.out.println("5. Display the doubly linked list");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.println("Enter your choose: ");
            int choose = scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Enter your value: ");
                    int data = scanner.nextInt();
                    doubleLinkList.insertNodeAtBeginning(data);
                    break;
                case 2:
                    System.out.println("Enter your value: ");
                    int data1 = scanner.nextInt();
                    doubleLinkList.insertAtEnd(data1);
                    break;
                case 3:
                    doubleLinkList.deleteNodeFromBeginning();
                    break;
                case 4:
                    doubleLinkList.deleteNodeFromEnd();
                    break;
                case 5:
                    doubleLinkList.printList();;
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
