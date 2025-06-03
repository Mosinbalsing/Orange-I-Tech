import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);

       

       if (Character.isAlphabetic(ch)) {
         if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is Uppercase.");
        }else{
            System.out.println(ch + "is LowerCase");
        }

         if (ch=='A' || ch=='E' || ch =='I' || ch=='O' || ch=='U' || ch =='a' || ch=='e' || ch == 'i' || ch=='o' || ch == 'u') {
            System.out.println(ch + " character is Vowel.");
        }
        else{
            System.out.println(ch + " character is Consonant.");
        }
       }else{
        System.out.println(ch + " is not an Alphabet.");
       }
    }
}
