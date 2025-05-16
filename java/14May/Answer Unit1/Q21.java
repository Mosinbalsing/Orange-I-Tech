public class Q21 {
    public static void main(String[] args) {
        double P = 1000; 
        double r = 5; 
        double t = 2; 
        double SI = (P * r * t) / 100; 
        System.out.println("The Simple Interest is: " + SI);
        double CI = P * Math.pow((1 + r / 100), t) - P; 
        System.out.println("The Compound Interest is: " + CI);
     
    }
}