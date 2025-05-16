import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the second dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the first divisor: ");
        int divisor = scanner.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double quotient = dividend / divisor;
            double remainder = dividend % divisor;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
