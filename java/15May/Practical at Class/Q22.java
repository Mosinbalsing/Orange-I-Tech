import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        //mars = weight * g
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mars : ");
        double m = sc.nextDouble();
        System.out.print("Enter the Velocity : ");
        double v = sc.nextDouble();
        System.out.print("Enter the height : ");
        double h = sc.nextDouble();
        double g = 9.8;

        double ME = m * g * h + 0.5 * m * v *v;
        System.out.println("Mechanical Energy :" + ME + "J");
    }
}
