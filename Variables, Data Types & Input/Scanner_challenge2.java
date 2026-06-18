import java.util.Scanner;

public class Scanner_challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter your First Number : ");
        int a  = sc.nextInt();
        System.out.print("Enter your Second Number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum is: " + c);

    }
}
