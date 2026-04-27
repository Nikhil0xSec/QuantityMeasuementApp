/***
 * QuantityMeasurementApp - UC2: Inches measurement equality
 *
 * This class is responsible for checking the equality of two numerical values
 * measured in feet in the quantity Measurement Application.
 *
 */

public class QuantityMeasurementApp {

    /*
     * Generic method for length equality
     */
    public static boolean demonstrateLengthEquality(Length length1, Length length2) {
        return length1.equals(length2);
    }

    /*
     * Feet equality
     */
    public static void demonstrateFeetEquality() {
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(1.0, Length.LengthUnit.FEET);

        System.out.println("Feet Equal: " + demonstrateLengthEquality(feet1, feet2));
    }

    /*
     * Inches equality
     */
    public static void demonstrateInchesEquality() {
        Length inch1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inch2 = new Length(1.0, Length.LengthUnit.INCHES);

        System.out.println("Inches Equal: " + demonstrateLengthEquality(inch1, inch2));
    }

    /*
     * Feet and Inches comparison
     */
    public static void demonstrateFeetInchesComparison() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);

        System.out.println("1 Foot == 12 Inches: " + demonstrateLengthEquality(feet, inches));
    }

    /*
     * Main method
     */
    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}