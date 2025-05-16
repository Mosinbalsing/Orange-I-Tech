import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //s(semi perimeter )=a+b+c/2
        //area of trangal = under-root(s(s-a)(s-b)(s-c))
        System.out.print("Enter the value a :");
        double a = sc.nextDouble();
        System.out.print("Enter the value b :");
        double b = sc.nextDouble();
        System.out.print("Enter the value c :");
        double c = sc.nextDouble();

        double s=(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Trangle is :" + (int)area +" sq.cm");
    }
}