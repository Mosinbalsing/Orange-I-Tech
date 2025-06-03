import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        double CP = sc.nextDouble();
        System.out.print("Enter the Selling Price : ");
        double SP = sc.nextDouble();
       
        if (SP>CP) {
            System.out.println("The Profit is : "+(SP-CP));
            System.out.println("The Profit Percentage is : "+((SP-CP)/CP)*100);
        } else if(SP<CP) {
            System.out.println("The Loss is : "+(CP-SP));
            System.out.println("The Loss Percentage is : "+((CP-SP)/CP)*100);
        }
        else {
            System.out.println("No Profit No Loss");
        }
        
    }
}
