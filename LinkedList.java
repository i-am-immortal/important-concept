public class LinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    // insert at First Position
    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    // insert at Last Position
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next; // yaha ham agle node ka address assign kar rahe h

            }
            currNode.next = newNode;

        }
    }

    // to print the linked list
    void printList() {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println("your data is " + currNode.data);
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.printList();

    }
}