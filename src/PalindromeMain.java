import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int l = string.length();
        palindromeString palindromeString = new palindromeString(string);
        if (palindromeString.Pallindrome(string, l) == true) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }
}

