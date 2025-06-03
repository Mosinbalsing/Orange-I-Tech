public class Demo3 {
    public static void main(String[] args) {
        int a = 15;
        int b = 26;
        int c = 26;

        double s= (a + b + c) / 2;
        System.out.println("Area of triangle is: " + s);
        double area =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is: " + area);
       
    }
}
