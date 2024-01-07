package LinkList;

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

public class LinkList {
    Node head;
    void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
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
    }

    void deleteNode(int deletedValue){
        Node current = head;
        Node prvNode = null;

        // Check if the node to be deleted is the head
        if (current != null && current.data == deletedValue){
            head = current.next;
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
    }

    void printList(){
        Node current = head;
        while (current != null){
            System.out.print(" "+current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        linkList.insertAtBeginning(10);
        linkList.insertAtBeginning(20);
        linkList.insertAtBeginning(30);
        linkList.insertAtBeginning(40);

        linkList.insetAtEnd(100);
        linkList.insetAtEnd(200);

        linkList.printList();

        System.out.println();

        linkList.deleteNode(10);

        linkList.printList();
    }
}
