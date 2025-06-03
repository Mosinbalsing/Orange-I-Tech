import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num%17==0) {
            System.out.println("The Number is divisible by 17");
        } else {
            System.out.println("The Number is not divisible by 17");
        }
        
    }
}
