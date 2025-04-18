
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to the Java Calculator! =====");
        System.out.println("Available operations:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("0. Exit");

        while (true) {
            System.out.print("\nEnter your choice of operation (0 to exit): ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                sc.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double num1 = 0, num2 = 0;


            
}
    }