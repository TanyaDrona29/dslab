package patternMenu;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        patternClass patternClass = new patternClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to menu driven pattern program");
        System.out.println("Press 1 : to display a rectangle pattern\n" +
                "Press 2 : to display a square pattern\n" +
                "Press 3 : to display a right angled lower triangle\n" +
                "press 4 : to display a right angled upper triangle");
        int choice = scanner.nextInt();

    }
