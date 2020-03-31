package linearSearch;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter element to be searched");
        int searchElement = scanner.nextInt();
        MyLinearSearch myLinearSearch = new MyLinearSearch(arr);
        boolean result = myLinearSearch.linearSearch(searchElement);
        if (result) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}