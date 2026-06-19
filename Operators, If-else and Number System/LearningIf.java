import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Gender: ");
        String gender = sc.nextLine();

        if (gender.equals("Male")) {
            System.out.println("Welcome Mr." + name);
        }
        else {
            System.out.println("Welcome Ms." + name);
        }

    }
}
