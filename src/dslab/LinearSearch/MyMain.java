package dslab.LinearSearch;

public class MyMain {
    public static void main(String[] args) {
        SearchLinkedList sList = new SearchLinkedList();
        sList.addNode(11);
        sList.addNode(12);
        sList.addNode(13);
        sList.addNode(14);
        sList.searchNode(12);
        sList.searchNode(7);
    }
}
