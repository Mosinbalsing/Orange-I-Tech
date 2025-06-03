import java.util.Scanner;

public class Guss {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);
        
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        int guss = -1;
        do {
            cnt++;
            System.out.print("Enter the Gess Number : ");
            guss = sc.nextInt();
            if (guss<random) {
                System.out.println("Number is Getertanan "+guss+": ");
            }
            else
            {
                System.out.println("Number is Lesstanan "+guss+": ");
            }
        } while (guss!=random);
        System.out.println("You Won !!! in " + cnt + " Attempts");

    }
}