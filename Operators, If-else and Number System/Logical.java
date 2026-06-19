import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please enter your name : ");
        String name = input.nextLine();
        System.out.print("Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Are you Female (True/False)? ");
        boolean gender = input.nextBoolean();

        if (age < 5) {
            System.out.println("You got 75% Discount");
        } else if (gender) {
            System.out.println("You got 50% Discount");
        } else if (age > 60 && !gender) {
            System.out.println("You got 25% Discount");
        } else
            System.out.println("You got no Discount");


    }
}
