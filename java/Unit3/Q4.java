public class Q4 {

    public static void checkArmstrong() {
        int num = 1634;
        int len = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        checkArmstrong();
    }

}