import java.util.Scanner;
public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Only digits");
        }
    }
}
