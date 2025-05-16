import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Liter milk you want: ");
        double milk = sc.nextDouble();
        double purchasedPrice = milk *3.25 ;
        double water = milk/4;
        double mixedMilk = milk + water;
        double sellingPrice = mixedMilk * 4.15;
        double profit = sellingPrice - purchasedPrice;
        System.out.println("The profit is: " + profit);
    }
}
