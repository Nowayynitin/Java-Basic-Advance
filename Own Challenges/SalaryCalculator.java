import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Salary Calculator");
        System.out.print("Enter Your Basic Salary: ");
        double basicSalary = input.nextDouble();

        double HRA = 0.2 * basicSalary;
        double DA = 0.1 *  basicSalary;

        double total = basicSalary + HRA + DA;

        System.out.println("The HRA is  : " + HRA);
        System.out.println("The DA is  : " + DA);
        System.out.println("The Total Salary is  : " + total);

    }
}
