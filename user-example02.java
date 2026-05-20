import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int first = input.nextInt();

        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();

        int multiplication = first * second;

        System.out.println("Multiplication: " + multiplication);

    }
}