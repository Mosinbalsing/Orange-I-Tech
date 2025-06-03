import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        double ticketPrice = 200;
        if (age<13 || age>64) {
            System.out.println("you get 10 % discount");
            System.out.println(ticketPrice-(ticketPrice*0.1));
        }
        else{
            System.out.println("you get 0 % discount");
            System.out.println(ticketPrice);
        }
    }
}
