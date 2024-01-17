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

    void insertNodeAtAnyPosition(int data,int index){
        NodeDouble newNode = new NodeDouble(data);
        if (index == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println(data+" is inserted");
        } else {
            int i =1;
            NodeDouble current = head;
            while(i < index-1 && current != null){
                current = current.next;
                i++;
            }
            if (current == null){
                System.out.println("Index not found");
            } else {
                newNode.prev = current;
                newNode.next = current.next;
                current.next = newNode;
                System.out.println(data+" is inserted");
            }
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

    void deleteNodeAtAnyPosition(int deletedValue){
        NodeDouble current = head;
        NodeDouble prevNode = null;

        if (head == null) {
            System.out.println("Node not is present in the list.");
        } else {
            // Check if the node to be deleted is the head
            if (current != null && current.data == deletedValue) {
                head = current.next;
                head.prev = null;
                System.out.println(deletedValue+" is delete.");
                return;
            }

            // Search for the node to be deleted and keep track of the previous node
            while(current != null && current.data != deletedValue){
                prevNode = current;
                current = current.next;
            }

            // If the key is not present in the linked list
            if (current == null) {
                System.out.println("Node not is present in the list.");
                return;
            }
            prevNode.next = current.next;
            System.out.println(deletedValue+" is delete.");
        }
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
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        DoubleLinkList doubleLinkList = new DoubleLinkList();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("============ Double LinkList ===========");
            System.out.println("1. Insert element at beginning");
            System.out.println("2. Insert an element at end");
            System.out.println("3. Insert node at any position");
            System.out.println("4. Delete an element from beginning");
            System.out.println("5. Delete an element from any position");
            System.out.println("6. Display an element from end");
            System.out.println("7. Display the doubly linked list");
            System.out.println("8. Exit");
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
                    System.out.println("Enter your value: ");
                    int data2 = scanner.nextInt();
                    System.out.println("Enter your Index: ");
                    int index = scanner.nextInt();
                    doubleLinkList.insertNodeAtAnyPosition(data2,index);
                    break;
                case 5:
                    System.out.println("Enter the value to be deleted: ");
                    int deletedValue = scanner.nextInt();
                    doubleLinkList.deleteNodeAtAnyPosition(deletedValue);
                    break;
                case 4:
                    doubleLinkList.deleteNodeFromBeginning();
                    break;
                case 6:
                    doubleLinkList.deleteNodeFromEnd();
                    break;
                case 7:
                    doubleLinkList.printList();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
