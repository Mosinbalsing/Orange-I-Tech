import java.util.Scanner;

public class Q3 {
    public static double getPE(){
        double PE = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m :");
        double m = sc.nextDouble();
        System.out.print("Enter the g :");
        double g = sc.nextDouble();
        System.out.print("Enter the h :");
        double h = sc.nextDouble();
        PE = m * g * h;
        return PE;
    }
    
    public static void main(String[] args) {
        double pe = getPE();
        System.out.println("The Potential Energy is : " + pe);
    }
}
