import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print( name + ", also tell me your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old");
    }
}
