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
        switch (choice) {
            case 1:
                System.out.println("you have choose to print a rectangle");
                System.out.println("enter length of rectangle.");
                int length = scanner.nextInt();
                System.out.println("enter breadth of rectangle.");
                int breadth = scanner.nextInt();
                patternClass.printRectangle(length, breadth);
                break;
            case 2:
                System.out.println("you have choosen to print a square");
                System.out.println("enter length of square.");
                int lengthSquare = scanner.nextInt();
                patternClass.printSquare(lengthSquare);
                break;
            case 3:
                System.out.println("you have choosen to print a lower triangle");
                System.out.println("enter height of triangle.");
                int height = scanner.nextInt();
                patternClass.lowerTriangle(height);
                break;
            case 4:
                System.out.println("you have choosen to print a upper triangle");
                System.out.println("enter height of triangle");
                int size = scanner.nextInt();
                patternClass.upperTriangle(size);
                break;
            default:
                System.out.println("Invalid option!! I am sorry");
        }
    }
    }
