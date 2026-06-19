import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Category Finder");
        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        if (age<13) {
            System.out.println("You Belong To Child Category");
        } else if (age<20) {
            System.out.println("You Belong To Teen Category");
        }  else if (age<60) {
            System.out.println("You Belong To Adult Category");
        } else
            System.out.println("You Belong To Senior Category");
    }
}
