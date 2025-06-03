import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Prodect Price : ");
        double price = sc.nextDouble();
        System.out.print("Enter the Prodect Category : ");
        String category = sc.next();
        System.out.println("Prodect Price : " + price);
        System.out.println("Prodect Category : " + category);
        if(category=="Electronics "){
                System.out.println("You get 10 % Discount");
                double discount = price * 0.1;
                System.out.println("Final Price : " + (price - discount));
        }
        else if(category=="Clothing"){
            if (price>5000) {
                System.out.println("You get 20 % Discount");
                double discount = price * 0.2;
                System.out.println("Final Price : " + (price - discount));
            }
            else {
                System.out.println("You get 15 % Discount");
                double discount = price * 0.15;
                System.out.println("Final Price : " + (price - discount));
            }
        }
        else if(category=="Food "){
            if (price>5000) {
                System.out.println("You get 5 % Discount");
                double discount = price * 0.05;
                System.out.println("Final Price : " + (price - discount));
            }
            else {
                System.out.println("You get No Discount");
                
            }
        }
    }
}
