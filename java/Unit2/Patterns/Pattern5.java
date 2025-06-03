package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int d = num/2;
        System.out.println(d);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= (num+1)/2-(i-1); j++) {
                System.out.print(" _ ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
