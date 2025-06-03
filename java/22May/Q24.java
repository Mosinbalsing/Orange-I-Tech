import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time in years: ");
        double time = sc.nextDouble();
        System.out.print("Enter Number of times interest applied per time period: ");
        double n = sc.nextDouble();
        double amount = principal * Math.pow((1 + (rate / (n * 100))), n * time);
        System.out.println("Amount after " + time + " years is: " + amount);
        System.out.println("Compound Interest is: " + (amount - principal));
    }
    
}
