import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number  : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number  : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number  : ");
        int num3 = sc.nextInt();
        System.out.print("Enter 3rd Number  : ");
        int num4 = sc.nextInt();
        

        if (num1>num2 && num1>num3 && num1>num4) {
            System.out.println(num1+" is the largest number.");
        }
        else if (num2>num1 && num2>num3 && num2>num4) {
            System.out.println(num2+" is the largest number.");
        }
        else if (num3>num1 && num3>num2 && num3>num4) {
            System.out.println(num3+" is the largest number.");
        }
        else {
            System.out.println(num4+" is the largest number.");
        }
    }
}
