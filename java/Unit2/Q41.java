import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your week day : ");
        String day = sc.next();

        if(age>13 && (day.equals("Sunday") || day.equals("Saturday"))) {
            System.out.println("your ticket price is Rs .120");
        }
        else{
            System.out.println("your ticket price is Rs .100");
        }
        if (age>13 && age<64 && (day.equals("Sunday") || day.equals("Saturday") )) {
            System.out.println("your ticket price is Rs .180");
            
        }
         else{
            System.out.println("your ticket price is Rs .150");
        }
        if (age>=65  && (day.equals("Sunday") || day.equals("Saturday") )) {
            System.out.println("your ticket price is Rs .150");
            
        }
         else{
            System.out.println("your ticket price is Rs .130");
        }


        
    }
}
