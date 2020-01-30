package Singlylinkedlist;

import Singlylinkedlist.node.Node;

public class Mylinkedlist {
    Node head;

    public Mylinkedlist() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insertatlast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    public void printlist() {
        System.out.println("printing list...");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.getNext();
            if (temp != null) {
                System.out.print("--->");
            }
        }
    }

    public void insertatbegning(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = null;
    }

    public Node deletefrombegning() {
        Node response = null;
        response = head;
        if (head != null) {
            head = head.getNext();
        }
        return response;
    }
}
