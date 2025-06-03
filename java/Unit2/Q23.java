import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X value: ");
        int x = sc.nextInt();
        System.out.print("Enter the Y value: ");
        int y = sc.nextInt();

        if (x>0 && y>0) 
            System.out.println("The point is in the first quadrant.");
        else if (x <0 && y >0)
        System.out.println("The point is in the second quadrant.");
        else if (x <0 && y <0)
        System.out.println("The point is in the third quadrant.");
        else if (x >0 && y <0)
        System.out.println("The point is in the fourth quadrant.");
        else
        System.out.println("The point is on the origin.");
    }
}
