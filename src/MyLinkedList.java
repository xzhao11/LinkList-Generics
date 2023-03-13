//TODO: change this Node Class to take in a generic type as its data
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

//TODO: change this linkList class to use your new node class
public class MyLinkedList {

    private IntNode root;


    public void add(int data) {
        if (root == null) {
            root = new IntNode(data);
            return;
        }

        IntNode tmp = root;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new IntNode(data);
    }


    public void addAtFront(int data) {
        IntNode newRoot = new IntNode(data);
        newRoot.next = root;
        root = newRoot;
    }


    public void addAtIndex(int data, int index) {
        if (root == null)
            return;

        IntNode tmp = root;
        while (index > 1) {
            if (tmp == null)
                return;

            tmp = tmp.next;
            index--;
        }

        IntNode nextNode = tmp.next;
        tmp.next = new IntNode(data);
        tmp.next.next = nextNode;
    }


    public int removeFromFront() {
        int data = root.data;
        root = root.next;
        return data;
    }


    public int remove() {
        IntNode tmp = root;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        int data = tmp.next.data;
        tmp.next = null;
        return data;
    }


    public void printList() {
        if (root == null) {
            System.out.println("List is Empty");
            return;
        }
        IntNode tmp = root;
        while (tmp != null) {
            System.out.print(">" + tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }

}



