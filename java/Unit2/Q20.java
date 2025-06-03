import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        double balance = 10000.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Withdrawal Amount : ");
        double amt = sc.nextDouble();
        if (amt>balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance = balance-amt;
           System.out.println("Amount Withdrawn Successfully of Rs "+amt+" . Remaining Balance: "+balance);
        }
        System.out.println("Thank You.");
    }
}
