import java.sql.SQLOutput;
import java.util.Scanner;

public class AllOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        System.out.println("Addition of the Numbers");
        int c = a+b;
        System.out.println(c);
        System.out.println("Subtraction of the Numbers");
        int d = a-b;
        System.out.println(d);
        System.out.println("Multiplication of the Numbers");
        int e = a*b;
        System.out.println(e);
        System.out.println("Division of the Numbers");
        int f = a/b;
        System.out.println(f);

    }
}
