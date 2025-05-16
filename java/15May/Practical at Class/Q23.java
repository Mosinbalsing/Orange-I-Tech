import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Diamention of  the Room :");
        System.out.print("Length : ");
        double l = sc.nextDouble();
        System.out.print("Breadth : ");
        double b = sc.nextDouble();
        System.out.print("Height : ");
        double h = sc.nextDouble();
        double volume = l * b * h;
        System.out.println("Enter the Diamention of  the Window :");
        System.out.print("Length : ");
        double wl = sc.nextDouble();
        System.out.print("Breadth : ");
        double wb = sc.nextDouble();
        System.out.println("Enter the Diamention of  the Door :");
        System.out.print("Length : ");
        double dl = sc.nextDouble();
        System.out.print("Breadth : ");
        double db = sc.nextDouble();



        double areaofroom = 2 * (l * b + l * h + b * h);
        double areaofwindow = wl * wb;
        double areaofdoor = dl * db;
        double area = areaofroom - areaofwindow - areaofdoor;
        System.out.println("Area of Room : "+area+" sq.ft.");
        
    }
}
