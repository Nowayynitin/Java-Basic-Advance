import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter the marks of the First Subject : ");
        int marks = input.nextInt();
        System.out.print("Enter the marks of the Second Subject : ");
        int marks2 = input.nextInt();
        System.out.print("Enter the marks of the Third Subject : ");
        int marks3 = input.nextInt();
        System.out.print("Enter the marks of the Fourth Subject : ");
        int marks4 = input.nextInt();
        System.out.print("Enter the marks of the Fifth Subject : ");
        int marks5 = input.nextInt();

        int total = marks+marks2+marks3+marks4+marks5;
        System.out.println("The total is " + total);

        double percentage = ((double) total/500)*100;
        System.out.println("The percentage is " + percentage);

        if (percentage>90) {
            System.out.println("Your Grade is A");
        } else if (percentage>75) {
            System.out.println("Your Grade is B");
        } else if (percentage>60) {
            System.out.println("Your Grade is C");
        } else if (percentage>30) {
            System.out.println("Your Grade is D");
        } else
            System.out.println("Your Grade is f");
    }

}
