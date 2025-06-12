package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print("Enter your index : ");
        int index = sc.nextInt();

        double sum = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                long factorial = 1;
                int j = i;
                while (j > 0) {
                    factorial *= j;
                    j--;
                }
                double term = Math.pow(i, index) / factorial;
                if (count % 2 == 0) {
                    sum += term;
                } else {
                    sum -= term;
                }
                count++;

            }
        }
        System.out.println("The sum is: " + sum);

    }
}
