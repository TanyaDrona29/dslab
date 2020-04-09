package patternMenu;

public class patternClass {
    public void printRectangle(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printSquare(int lengthSquare) {
        for (int i = 1; i <= lengthSquare; i++) {
            for (int j = 1; j <= lengthSquare; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void lowerTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

