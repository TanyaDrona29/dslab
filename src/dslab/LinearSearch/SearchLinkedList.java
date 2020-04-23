package dslab.LinearSearch;

public class SearchLinkedList {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }
}