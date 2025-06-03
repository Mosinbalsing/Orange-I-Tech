package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        for(int i = n; i > 0 ; i--) {
            char ch = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print("  "+ch++ + "  ");
            }
            System.out.println();
        }
        for(int i =2 ; i <=n ; i++) {
            char ch = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print("  "+ch++ + "  ");
            }
            System.out.println();
        }
    }
}
