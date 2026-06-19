import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your branch: ");
        String branch = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Your Details Are : ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}
