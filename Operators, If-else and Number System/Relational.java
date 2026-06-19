import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if  (age >= 18) {
            System.out.println(name+" You are ready to have a Driving License");
        } else
            System.out.println(name+" You have to be of age 18 or above of 18 to get a new Driving License");

    }
}
