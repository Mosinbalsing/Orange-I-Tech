import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if (num%5==0 && num%7==0) {
            System.out.println("The Number is divisible by 5 and 7");
        } else {
            System.out.println("The Number is not divisible by 5 and 7");
            
        }
        
    }
}
