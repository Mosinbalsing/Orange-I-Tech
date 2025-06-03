import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        double BasicSalary = sc.nextDouble();
        double HEA = 0.3 * BasicSalary;
        double TA = 0.2 * BasicSalary;

        double grossSalary = BasicSalary + HEA + TA;
        System.out.println("The Gross Salary is: " + grossSalary);
    }
}