import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Subject 1 Marks : ");
        double marks1 = sc.nextDouble();
        System.out.print("Enter the Subject 2 Marks : ");
        double marks2 = sc.nextDouble();
        System.out.print("Enter the Subject 3 Marks : ");
        double marks3 = sc.nextDouble();

        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100;
        System.out.println("The Percentage is : "+percentage);
        if (percentage>=90) {
            System.out.println("Grade A+");
        }
        else if (percentage>=80) {
            System.out.println("Grade A");
        }
        else if (percentage>=70) {
            System.out.println("Grade B+");
        }
        else if (percentage>=60) {
            System.out.println("Grade B");
        }
        else if (percentage>=50) {
            System.out.println("Grade C+");
        }
        else if (percentage>=36) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
            
        }
        
    }
}
