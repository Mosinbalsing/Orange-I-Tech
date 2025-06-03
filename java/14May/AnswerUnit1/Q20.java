//20. Write a program to read the marks of 5 subjects and display the total, percentage ?

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int marks1, marks2, marks3, marks4, marks5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects:");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        marks5 = sc.nextInt();
        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (total / 5.0);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
