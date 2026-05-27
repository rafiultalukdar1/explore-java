import java.util.Scanner;

public class Main {

    // Method
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Variables
        int age = 20;
        double cgpa = 3.75;
        boolean isStudent = true;

        // Input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Print
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Student: " + isStudent);

        // Operator
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));

        // Condition
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Array
        int[] numbers = {10, 20, 30};

        System.out.println(numbers[0]);

        // Method Call
        greet(name);
    }
}