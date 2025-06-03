import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Second Number: ");
        int ss = sc.nextInt();
        int  HH = ss/3600;
        int MM = (ss%3600)/60;
        int SS = ss%60;
        System.out.println("The Time is: " + HH + " Hours " + MM + " Minutes " + SS + " Seconds");
    }
}
