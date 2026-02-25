import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s= sc.nextLine();
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Replace : " + s.replace('a','$'));
        System.out.println("First 4 characters:"+s.substring(0,4));
        sc.close();
    }
}