import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        } else if (n == 1) {
            System.out.println("Fibonacci Series: 0");
            return;
        } else if (n == 2) {
            System.out.println("Fibonacci Series: 0 1");
            return;
        }
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
