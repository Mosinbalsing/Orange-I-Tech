import java.util.Scanner;

public record Pass() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass =0000;
        do {
            System.out.print("Enter the Password : ");
            pass = sc.nextInt();
        } while (pass!=1234);
        System.out.println("Youe Phone is Unlocked : ) ");
    }
}
