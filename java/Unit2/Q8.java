import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the : ");
        int num = sc.nextInt();
        if (num==0) {
            System.out.println("The Number is Zero");
        } else if (num>0) {
            System.out.println("The Number is Positive");
        } else {
            System.out.println("The Number is Negative");
        }
    }
}
