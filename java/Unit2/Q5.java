import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if (num%5 == 0 || num%3 == 0) {
            System.out.println("The Number is divisible by 5 or 3");
        }
        else {
            System.out.println("The Number is not divisible by 5 or 3");
        }
        
    }
}
