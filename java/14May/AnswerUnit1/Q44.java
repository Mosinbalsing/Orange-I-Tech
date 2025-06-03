import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Number you want to enter: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("The Arithmetic Mean is: " + average);
        System.out.println("The Harmonic Mean is: " + (double) n / sum);
        
    }
}
