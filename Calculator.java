import java.util.Scanner;
class SimpleCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char op;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch(op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
