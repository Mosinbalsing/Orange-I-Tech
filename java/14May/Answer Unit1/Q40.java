import java.util.Scanner;

public class Q40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary:");
        double salary = sc.nextDouble();
        double DA = salary *0.2;
        double HRA = salary *0.4;
        double grossSalary = salary + DA + HRA;
        System.out.println("Your gross salary is: " + grossSalary);
    }
}