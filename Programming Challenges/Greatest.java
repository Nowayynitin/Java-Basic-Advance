import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Greatest Number Finder");
        System.out.print("Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter your Third Number: ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("The number \"" + num1 + "\" is Greatest");
        } else if (num2>num1 && num2>num3) {
            System.out.println("The number \"" + num2 + "\" is Greatest");
        } else if (num3>num1 && num3>num2) {
            System.out.println("The number \"" + num3 + "\" is Greatest");
        }
    }
}

