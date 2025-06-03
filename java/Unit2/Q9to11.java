import java.util.Scanner;

public class Q9to11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int num3 = sc.nextInt();

        if (Math.min(num2, num3) < num1 && num1 < Math.max(num2, num3)) {
            System.out.println(num1 + " is the between " + num2 + " and " + num3);
        } else if (Math.min(num1, num3) < num2 && num2 < Math.max(num1, num3)) {
            System.out.println(num2 + " is the between " + num1 + " and " + num3);
        } else if (Math.min(num1, num2) < num3 && num3 < Math.max(num1, num2)) {
            System.out.println(num3 + " is the between " + num1 + " and " + num2);

        }

    }
}