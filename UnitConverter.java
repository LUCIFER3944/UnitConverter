import java.text.DecimalFormat;
import java.util.Scanner;

public class UnitConverter {

    private static final double METER_TO_CENTIMETER = 100;
    private static final double KILOMETER_TO_METER = 1000;
    private static final double FEET_TO_INCHES = 12;
    private static final double RUPEES_TO_DOLLARS_RATE = 0.014;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion:");
        System.out.println("1. Meter to Centimeter");
        System.out.println("2. Kilometer to Meter");
        System.out.println("3. Feet to Inches");
        System.out.println("4. Rupees to Dollars");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertMeterToCentimeter(scanner);
                break;
            case 2:
                convertKilometerToMeter(scanner);
                break;
            case 3:
                convertFeetToInches(scanner);
                break;
            case 4:
                convertRupeesToDollars(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static void convertMeterToCentimeter(Scanner scanner) {
        System.out.println("Enter length in meters:");
        double meters = scanner.nextDouble();
        double centimeters = meters * METER_TO_CENTIMETER;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");
    }

    private static void convertKilometerToMeter(Scanner scanner) {
        System.out.println("Enter length in kilometers:");
        double kilometers = scanner.nextDouble();
        double meters = kilometers * KILOMETER_TO_METER;
        System.out.println(kilometers + " kilometers is equal to " + meters + " meters.");
    }

    private static void convertFeetToInches(Scanner scanner) {
        System.out.println("Enter length in feet:");
        double feet = scanner.nextDouble();
        double inches = feet * FEET_TO_INCHES;
        System.out.println(feet + " feet is equal to " + inches + " inches.");
    }

    private static void convertRupeesToDollars(Scanner scanner) {
        System.out.println("Enter amount in Rupees:");
        double rupees = scanner.nextDouble();
        double dollars = rupees * RUPEES_TO_DOLLARS_RATE;
        System.out.println(rupees + " Rupees is equal to " + formatToTwoDecimalPlaces(dollars) + " Dollars.");
    }

    private static String formatToTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}
