import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }
}