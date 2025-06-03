import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Milk in liters: ");
        double milk = sc.nextDouble();
        double buyingPrice = 3.25;
        double sellingPrice = 4.15;
        double water = milk / 4;
        double mixedMilk = milk + water;
        double profit = (mixedMilk * sellingPrice) - (milk * buyingPrice);
        System.out.print("The profit is: " + profit);
        System.out.print("\nThe amount of water added is: " + water);

    }
}