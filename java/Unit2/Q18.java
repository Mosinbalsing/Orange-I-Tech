import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the PIN: ");
        int pin = sc.nextInt();

        if (pin == 1234) {
            System.out.println("PIN is correct.");
        } else {
            System.out.println("PIN is incorrect.");
        }
        
    }
}
