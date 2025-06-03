import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amt : ");
        double amt = sc.nextDouble();

        if (amt>=5000) {
            System.out.println("you get discount of 5% :"+(amt*0.05));
            System.out.println("Total amount is : "+(amt-(amt*0.05)));
        }
        else if (amt>=10000) {
            System.out.print("you get discount of 10% :"+(amt*0.1));
            System.out.println("Total amount is : "+(amt-(amt*0.1)));
        }
        else if (amt>=15000) {
            System.out.print("you get discount of 15% :"+(amt*0.15));
            System.out.println("Total amount is : "+(amt-(amt*0.15)));
        }
        else if (amt>=20000) {
            System.out.print("you get discount of 20% :"+(amt*0.2));
            System.out.println("Total amount is : "+(amt-(amt*0.2)));
        }
        else{
            System.out.println("No discount");
        }
        
    }
}
