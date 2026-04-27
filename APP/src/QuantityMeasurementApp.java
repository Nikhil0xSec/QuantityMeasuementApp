/***
 * QuantityMeasurementApp - UC1: Feet measurement equality
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
    // main class
    public static void main(String[] args) {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);

        System.out.println("Equal: " + feet1.equals(feet2));
    }
}