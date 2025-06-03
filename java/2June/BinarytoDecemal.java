import java.util.Scanner;

public class BinarytoDecemal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int binary = sc.nextInt();
        int pow = 0 ;
        int decimal =0;
        while (binary>0) {
            int digit =  binary %10;
            decimal += (int)(digit * Math.pow(2, pow++));
            binary/=10;
        }
        System.out.println("Binary Number is "+ decimal);
        
    }
}