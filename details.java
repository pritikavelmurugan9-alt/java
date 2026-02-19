import java.util.Scanner;
public class details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println("Enter registration:");
        int registration = sc.nextInt();

        System.out.println("Enter department:");
        String department = sc.next();

        System.out.println("Mark1:");
        int mark1 = sc.nextInt();

        System.out.println("Mark2:");
        int mark2 = sc.nextInt();

        System.out.println("Mark3:");
        int mark3 = sc.nextInt();

        System.out.println("Mark4:");
        int mark4 = sc.nextInt();

        Mark s = new Mark(name, registration, department, mark1, mark2, mark3, mark4);
        s.calculate();
        s.display2();
    }
}


class student {
    String name;
    int registration;
    String department;

    student(String a, int b, String c) {
        name = a;
        registration = b;
        department = c;
    }

    void display1() {
        System.out.println("Name: " + name);
        System.out.println("Registration: " + registration);
        System.out.println("Department: " + department);
    }
}

class Mark extends student {
    int mark1, mark2, mark3, mark4, total;
    float average;
    String result;

    Mark(String name, int registration, String department, int m1, int m2, int m3, int m4) {
        super(name, registration, department);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }

     void calculate() {
        total = mark1 + mark2 + mark3 + mark4;
        average = total/4;

        if (mark1 > 40 && mark2 > 40 && mark3 > 40 && mark4 > 40){
            result = "Pass";
        }
        else{
            result = "Fail";
    }
     }

    public void display2() {
        display1();
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Mark4: " + mark4);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}

