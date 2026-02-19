import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter index:");
        int i = sc.nextInt();

        try {
            System.out.println(arr[i]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of range");
        }
    }
}
