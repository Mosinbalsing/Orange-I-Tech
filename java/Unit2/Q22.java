import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Side : ");
        int side1 = sc.nextInt();
        System.out.print("Enter the 2nd Side : ");
        int side2 = sc.nextInt();
        System.out.print("Enter the 3rd Side : ");
        int side3 = sc.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The Triangle is Equilateral Triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The Triangle is Isosceles Triangle.");
            } else if (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)
                    || Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
                    || Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
                System.out.println("The Triangle is Right Angle Triangle.");

            }

            else {
                System.out.println("The Triangle is Scalene Triangle.");
            }
        } else {
            System.out.println("Invalid Input");
        }

    }
}
