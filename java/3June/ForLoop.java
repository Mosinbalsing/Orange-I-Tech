import java.util.Scanner;

public class ForLoop {          
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Starting Point : ");
        // int start = sc.nextInt();
        // System.out.print("Enter the Ending Point : ");
        // int end = sc.nextInt();
        
        // for (int i = 1; i <=10; i++) {
        //     System.out.println(start+ " X " + i + " = " + (start * i));
            
        // }
        for (double i = 1; i <=10; i++) {
            System.out.printf("%.2f\n", Math.pow((i/10), 2));
        }
    }
}