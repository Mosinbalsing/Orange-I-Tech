import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance in Kilometers: ");
        double distance = sc.nextDouble();
        double meter = distance * 1000;
        double centimeter = meter * 100;
        System.out.print("Distance in Meters: " + meter);
        System.out.println();
        System.out.print("Distance in Centimeters: " + centimeter);
    }
}
