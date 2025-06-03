package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int  n = 5;
        for(int i = 0; i < n ; i++) {
            char ch = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print("  "+ch++ + "  ");
            }
            
            System.out.println();
        }
        for(int i = n-2; i > 0 ; i--) {
            char ch = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print("  "+ch++ + "  ");
            }
            System.out.println();
        }
    }
}
