import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the swap program\n");
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("\nSwapping Done ");
        System.out.println("Value of A is: " + a);
        System.out.println("Value of B is: " + b);


    }
}
