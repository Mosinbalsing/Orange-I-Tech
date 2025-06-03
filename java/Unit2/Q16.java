import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Loan Amount : ");
        double loan = sc.nextDouble();
        System.out.print("Enter the Rate of Interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time Period in Years : ");
        int time = sc.nextInt();
        double emi = (loan * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        System.out.println("The EMI is : "+emi);
        double interest = emi * time - loan;
        System.out.println("The Interest is : "+interest);
        System.out.println("The Total Payment is : "+(emi*time));
    }
}
