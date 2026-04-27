public class Length {

    // Instance variables
    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    /*
     * Convert value to base unit (inches)
     */
    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    /*
     * Compare two Length objects
     */
    public boolean compare(Length otherLength) {
        return Double.compare(this.convertToBaseUnit(),
                otherLength.convertToBaseUnit()) == 0;
    }

    /*
     * Override equals()
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

        Length other = (Length) obj;

        return compare(other);
    }
}