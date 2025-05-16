import java.util.*;
public class Milkproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter MilK in Liter :");
        int milk = sc.nextInt();
        System.out.println("Enter MilK price  :");
        int price = sc.nextInt();

        int water =  milk/4;
        int mixed_milk = milk + water;
        int total_price = mixed_milk * price;
        int profit = total_price-(milk*price);
        System.out.println("Profit on Milk ");
        System.out.println(profit);
    }
}