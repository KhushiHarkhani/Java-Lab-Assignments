import java.util.Scanner;

public class Calculator {

    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public float division(float n1, float n2) {
        return n1 / n2;
    }

    public int calcmod(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {

        Calculator op = new Calculator();
        Scanner scan = new Scanner(System.in);

        int choice;

        do {
            System.out.println("ENTER YOUR 1ST NUMBER :-");
            int num1 = scan.nextInt();

            System.out.println("ENTER YOUR 2ND NUMBER :-");
            int num2 = scan.nextInt();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Sum is :- " + op.addition(num1, num2));
                    break;

                case 2:
                    System.out.println("Difference is :- " + op.subtraction(num1, num2));
                    break;

                case 3:
                    System.out.println("Product is :- " + op.multiplication(num1, num2));
                    break;

                case 4:
                    if (num2 != 0)
                        System.out.println("Division is :- " + op.division(num1, num2));
                    else
                        System.out.println("Division by zero is not allowed.");
                    break;

                case 5:
                    System.out.println("Remainder is :- " + op.calcmod(num1, num2));
                    break;

                case 6:
                    System.out.println("Exiting calculator...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println();

        } while (choice != 6);

        scan.close();
    }
}
