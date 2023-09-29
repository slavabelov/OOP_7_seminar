class ComplexNumbers extends ComplexOperations{
    private static ComplexNumbers example;
    private double whole;
    private double virtual;

    private ComplexNumbers(double whole, double virtual) {
        this.whole = wholepart;
        this.virtual = virtualpart;
    }

    public static ComplexNumbers ExampleCalculation(double whole, double virtual) {
        if (example == null) {
            example = new Complex(whole, virtual);
        }
        return example;
    }

    public double WholePartRecieve() {
        return whole;
    }

    public double VirtualPartRecieve() {
        return virtual;
    }

    public ComplexNumbers summa(ComplexNumbers operations) {
        double freshWhole = this.whole + operations.whole;
        double freshVirtual = this.virtual + operations.virtual;
        return new ComplexNumbers(freshWhole, freshVirtual);
    }

    public ComplexNumbers difference(ComplexNumbers operations) {
        double freshWhole = this.whole - operations.whole;
        double freshVirtual = this.virtual - operations.virtual;
        return new ComplexNumbers(freshWhole, freshVirtual);
    }

    public ComplexNumbers multiplication(ComplexNumbers other) {
        double freshWhole = this.whole * operations.whole - this.virtual * operations.virtual;
        double freshVirtual = this.whole * operations.virtual + this.virtual * operations.whole;
        return new ComplexNumbers(freshWhole, freshVirtual);
    }

    public ComplexNumbers division(ComplexNumbers operations) {
        double divider = operations.whole * operations.whole + operations.virtual * operations.virtual;
        double freshWhole = (this.whole * operations.whole + this.virtual * operations.virtual) / divider;
        double freshVirtual = (this.virtual * operations.whole - this.whole * operations.virtual) / divider;
        return new ComplexNumbers(freshWhole, freshVirtual);
    }
}