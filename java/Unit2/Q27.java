import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number  : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number  : ");
        int num2 = sc.nextInt();
        int max = num1>num2?num1:num2;
        System.out.println(max+" is the largest number.");
    }
}
