import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int pow = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, pow);
            num /= 10;
        }

        return sum == originalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}