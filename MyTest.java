import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        System.out.println("What is your name: ");

        String fName = firstName.nextLine();

        Scanner Age = new Scanner(System.in);
        System.out.println("What is your Age: ");

        int age = Age.nextInt();

        System.out.println("Welcome " + " " + fName + " " + "Age " + age);
    }
}
