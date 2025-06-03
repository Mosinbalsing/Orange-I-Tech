import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vaccines taken : ");
        int vaccines = sc.nextInt();
        if (vaccines >= 2) {
            System.out.println("You are fully vaccinated.");
            System.out.println("Elegible for Interview.");
        } else {
            System.out.println("You are not fully vaccinated.");
            System.out.println("Not elegible for Interview.");
        }
        
    }
}
