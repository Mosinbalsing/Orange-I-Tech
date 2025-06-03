import java.util.Scanner;

public class Q32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of 1st Subject: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter the Marks of 2nd Subject: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter the Marks of 3rd Subject: ");
        double s3 = sc.nextDouble();

        double percent = (s1+ s2+ s3)/300*100;


        if (s1<40 || s2<40 ||s3<40) {
            System.out.println("Fail/Atkt");
        }
        else{
                if (percent>=90) {
                    System.out.println("O Class");
                }
                else if (percent>=80) {
                    System.out.println("A+ Class");
                }
                else if(percent>=70){
                    System.out.println("A Class");
                }
                else if(percent>=60){
                    System.out.println("B+ Class");
                }
                else if(percent>=50){
                    System.out.println("B Class");
                }
                else{
                    System.out.println("C Class");
                }
        }
        System.out.println("Your Got "+ percent+" %");
        
    }
}
