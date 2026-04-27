/***
 * QuantityMeasurementApp - UC2: Inches measurement equality
 *
 * This class is responsible for checking the equality of two numerical values
 * measured in feet in the quantity Measurement Application.
 *
 */
public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {

        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        /*
         * Override equals() for Feet comparison
         */
        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null) {
                return false;
            }

            if (getClass() != obj.getClass()) {
                return false;
            }

            Feet feet = (Feet) obj;

            return Double.compare(this.value, feet.value) == 0;
        }
    }

    // Inner class to represent Inches measurement
    public static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        /*
         * Override equals() for Inches comparison
         */
        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null) {
                return false;
            }

            if (getClass() != obj.getClass()) {
                return false;
            }

            Inches inches = (Inches) obj;

            return Double.compare(this.value, inches.value) == 0;
        }
    }

    /*
     * Static method to demonstrate Feet equality
     */
    public static void demonstrateFeetEquality() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        System.out.println("Feet Equal: " + feet1.equals(feet2));
    }

    /*
     * Static method to demonstrate Inches equality
     */
    public static void demonstrateInchesEquality() {
        Inches inch1 = new Inches(1.0);
        Inches inch2 = new Inches(1.0);

        System.out.println("Inches Equal: " + inch1.equals(inch2));
    }

    /*
     * Main method
     */
    public static void main(String[] args) {

        demonstrateFeetEquality();

        demonstrateInchesEquality();
    }
}