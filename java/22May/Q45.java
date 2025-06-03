import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double distance = sc.nextDouble();
        double meter = distance * 1000;
        double cm = distance * 100000;
        System.out.println("Distance in meters: " + meter);
        System.out.println("Distance in centimeters: " + cm);
    }
}
