package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Entertainment entertainment;
        entertainment = new Shole();
        System.out.println("Famous dialogue is... ");
        entertainment.display();
        Entertainment second;
        second = new Don();
        System.out.println("Famous dialouge is... ");
        second.display();

    }
}
