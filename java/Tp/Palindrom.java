import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the : ");
        int num = sc.nextInt();
        int rev =0;
        while (num>0) {
            int rem = num % 10;
            rev = rem + rev * 10;
            num = num / 10;
        }
        System.out.println(rev);
    }
}