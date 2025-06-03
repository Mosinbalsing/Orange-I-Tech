import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Salary : ");
        double salary = sc.nextDouble();
        double tax = 0;
        if (salary<=400000) {
            System.out.println("Tax is 0%");
        }
        else if (salary>400000 && salary<=800000) {
            System.out.println("Tax is 5%");
            tax = salary -( salary * 0.05);
            System.out.println("Tax is "+( salary * 0.05));
        }
        else if (salary>800000 && salary<=1200000) {
            System.out.println("Tax is 10%");
            tax = salary - (salary * 0.10);
            System.out.println("Tax is "+( salary * 0.05));
        }
        else {
            System.out.println("Tax is 15%");
            tax = salary - (salary * 0.15);
            System.out.println("Tax is "+( salary * 0.05));
        }
        
    }
}
