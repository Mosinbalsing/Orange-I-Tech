public class Q33 {
    public static void main(String[] args) {
        int seconds = 3661; 
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds.");
    }
}
