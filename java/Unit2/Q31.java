import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 10th Marks : ");
        double Marks10th = sc.nextDouble();
        
        System.out.print("Enter the 12th Marks : ");
        double Marks12th = sc.nextDouble();

        System.out.print("Enter the Graduation Marks : ");
        double Marksofgraduation = sc.nextDouble();

        double elegible = (Marks10th+Marks12th+Marksofgraduation)/300 * 100;

        System.out.println((float)elegible);

        if (elegible>=60) {
            System.out.println("You Are Elegibal for Interview");
        }else{
            System.out.println("You Are Not Elegibal for Interview");
        }

        
    }
}
