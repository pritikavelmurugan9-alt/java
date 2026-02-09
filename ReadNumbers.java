import java.util.Scanner;
public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("The program is stopped.");
                break;
            }
        }
        sc.close();
    }
}
