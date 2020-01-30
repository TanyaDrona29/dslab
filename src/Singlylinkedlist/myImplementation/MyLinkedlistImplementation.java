package Singlylinkedlist.myImplementation;

import Singlylinkedlist.Mylinkedlist;

public class MyLinkedlistImplementation {
    public static void main(String[] args) {
        Mylinkedlist linkedlist = new Mylinkedlist();
        //Node delete = linkedlist.deletefrombegning();
        linkedlist.insertatlast(200);
        linkedlist.insertatlast(100);
        linkedlist.printlist();
        linkedlist.insertatbegning(1);
        linkedlist.printlist();
        //delete = linkedlist.deletefrombegning();
        //if (delete != null) {
        //   System.out.println("deleted data = " + delete.getData());
        //} else {
        //   System.out.println("empty list");
        //}
    }
}
