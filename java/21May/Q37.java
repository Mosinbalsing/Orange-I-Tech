import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount of milk in liters:");
        double Milk = sc.nextDouble();
        double buyingprice = Milk * 4;
        double water = Milk /4;
        double mixed = Milk + water;
        double sellingprice = mixed * 5;
        double profit = sellingprice - buyingprice;
        System.out.println("The profit is: " + profit);
        System.out.println("The amount of water added is: " + water);
        
    }
}
