class Node {

    int key;
    int value;

    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
 
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

public void insertatFront(Node node) {
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;

        head = node;
    }

public void removeNode(Node node) {

        if (node == null) {
            return;
        }
        if (node == head) {
            head = head.next;
        }
        if (node == tail) {
            tail = tail.prev;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = null;
        if (head == null) {
            tail = null;
        }
    }

public void movetoFront(Node node) {

        if (node == head) {
            return;
        }
        removeNode(node);
       insertatFront(node);
    }

public Node removeTail() {

        if (tail == null) {
            return null;
        }
        Node removedNode = tail;
        removeNode(tail);
        return removedNode;
    }

public void display() {
     Node current = head;

        System.out.print("HEAD ==> ");

        while (current != null) {

            System.out.print("(" + current.key + ", " + current.value + ")");

            if (current.next != null) {
                System.out.print(" <==> ");
            }

            current = current.next;
        }

        System.out.println(" <== TAIL");
    }
}
