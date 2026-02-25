import java.util.Scanner;
public class BufferEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuffer c = new StringBuffer(input);
        System.out.println("Original StringBuffer: " + c);
        c.append(" JAVA");
        System.out.println("After Append: " + c);
        c.insert(0, "Start-");
        System.out.println("After Insert: " + c);
        c.replace(0, 5, "Begin");
        System.out.println("After Replace: " + c);
        c.delete(0, 6);
        System.out.println("After Delete: " + c);
        c.reverse();
        System.out.println("After Reverse: " + c);
        System.out.println("Length: " + c.length());
        System.out.println("Character at index 2: " + c.charAt(2));
    }
}