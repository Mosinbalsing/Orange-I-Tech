public class Strformat {
    public static void main(String[] args) {
        double a = 123.456;
        double b = 123.4567;
        System.out.println(String.format("a :%f", a)); // 123.456000
        System.out.println(String.format("b :%f", b)); // 123.456700
        System.out.print(String.format("%f + %f = %.2f ", a, b, a + b));
                
    }
}