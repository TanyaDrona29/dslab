package linearSearch;

public class MyLinearSearch {
    private int[] arrary;

    public MyLinearSearch(int[] arrary) {
        this.arrary = arrary;
    }

    public boolean linearSearch(int searchElement) {
        boolean elementFound = false;
        for (int i = 0; i < arrary.length; i++) {
            if (searchElement == arrary[i]) {
                elementFound = true;
                break;
            }
        }
        return elementFound;
    }
}
