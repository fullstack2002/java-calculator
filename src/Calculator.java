import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        System.out.println("Enter a number: ");
        int b = scan.nextInt();

        System.out.println("Enter arithmetic operator: ");
        scan.nextLine();
        char operator = scan.nextLine().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error");
                } else {
                    result = a / b;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}

