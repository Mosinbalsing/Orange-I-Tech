import java.util.Scanner;

public class CoutingNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cash $:");
        int cash = sc.nextInt();

        int c500 = cash / 500 ;
        cash = cash % 500;
        System.out.println("Total Notes of 500Rs is "+c500);

        int c200 = cash /200;
        cash = cash % 200;
        System.out.println("Total Notes of 200Rs is "+c200);

        int c100 = cash /100;
        cash = cash % 100;
        System.out.println("Total Notes of 100Rs is "+c100);

        int c50 = cash /50;
        cash = cash % 50;
        System.out.println("Total Notes of 50Rs is "+c50);

        int c20 = cash /20;
        cash = cash % 20;
        System.out.println("Total Notes of 20Rs is "+c20);
        
        int c10 = cash /10;
        cash = cash % 10;
        System.out.println("Total Notes of 10Rs is "+c10);
        
        int c5 = cash /5;
        cash = cash % 5;
        System.out.println("Total coin of 5Rs is "+c5);
        
        int c2 = cash /2;
        cash = cash % 2;
        System.out.println("Total coin of 2Rs is "+c2);
        
        int c1 = cash /1;
        cash = cash % 1;
        System.out.println("Total coin of 1Rs is "+c1);
        
    }
}
