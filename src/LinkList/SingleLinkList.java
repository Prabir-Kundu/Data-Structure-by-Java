package LinkList;

import java.util.Scanner;

/**
 * Todo: What is LinkList?
 * Ans:
 * */

class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
    }
}

public class SingleLinkList {
    Node head;
    void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        System.out.println(value+" is inserted");
    }

    void insetAtEnd(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        System.out.println(value+" is inserted");
    }

    void insertNodeAtAnyPosition(int value,int index){
        Node newNode = new Node(value);
        if (index == 1){
            newNode.next = head;
            head = newNode;
        } else {
            int i = 1;
            Node current = head;
            while (i < index-1 && current != null){
                current = current.next;
                i++;
            }
            if (current == null){
                System.out.println("Index not found");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
        System.out.println(value+" is inserted");
    }

    void deleteNode(int deletedValue){
        Node current = head;
        Node prvNode = null;

        if (head == null){
            System.out.println("No node is present");
        } else {
            // Check if the node to be deleted is the head
            if (current != null && current.data == deletedValue){
                head = current.next;
                System.out.println(deletedValue+" is deleted.");
                return;
            }

            // Search for the node to be deleted and keep track of the previous node
            while (current != null && current.data != deletedValue){
                prvNode = current;
                current = current.next;
            }

            // If the key is not present in the linked list
            if (current == null){
                return;
            }

            prvNode.next = current.next;
            System.out.println(deletedValue+" is deleted.");
        }
    }

    /*void deleteNodeByEnteringThePositionOfTheNode(int index){
        int i = 0;
        Node prv;
        Node current = head;
        if (current == null){
            System.out.println("No node is present");
        } else if (index == 0) {
            System.out.println("Please enter your input from 1.");
        } else if(index == 1){
            System.out.println(current.data+" is deleted.");
            head = current.next;
        } else {
            while (i <= index){
                prv = current;
                current = current.next;
                if (i == index){
                    prv.next = current.next;
                    return;
                }
                i++;
            }
        }
    }*/

    void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkList linkList = new SingleLinkList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("============ Single LinkList ===========");
            System.out.println("1. Insert element at beginning");
            System.out.println("2. Insert an element at end");
            System.out.println("3. Insert node at any position");
            System.out.println("4. Delete an element by entering value");
            System.out.println("5. Display the Single linked list");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.println("Enter your choose: ");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter your value: ");
                    int data = scanner.nextInt();
                    linkList.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.println("Enter your value: ");
                    int data1 = scanner.nextInt();
                    linkList.insetAtEnd(data1);
                    break;
                case 3:
                    System.out.println("Enter your value: ");
                    int data2 = scanner.nextInt();
                    System.out.println("Enter your index: ");
                    int index = scanner.nextInt();
                    linkList.insertNodeAtAnyPosition(data2,index);
                    break;
                case 4:
                    System.out.println("Enter your value to be deleted: ");
                    int dataData = scanner.nextInt();
                    linkList.deleteNode(dataData);
                    break;
                case 5:
                    linkList.printList();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
