import java.util.Scanner;

public class Floating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter the First Float value : ");
        double a = sc.nextDouble();
        System.out.print("Enter the Second Float value : ");
        double b = sc.nextDouble();

        double c = a*b;
        System.out.println("Product of the Floating Value is : "+ c);
    }
}
