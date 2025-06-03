import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number  : ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        System.out.println("Enter Number is Have "+str.length()+" Digits");
    }
}
