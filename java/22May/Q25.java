public class Q25 {
    public static void main(String[] args) {
        double m = 50; // Mass in kilograms
        double g = 9.8; // Acceleration due to gravity in m/s^2
        double h = 100; // Height in meters
        double v = Math.sqrt(2 * g * h); // Velocity in meters per second
        double mechanicalEnergy = (m*g*h) + (0.5*m* Math.pow(v, 2)); // Mechanical energy in joules
        System.out.println(String.format("The mechanical energy is %.2f joules", mechanicalEnergy));
    
    }
}
