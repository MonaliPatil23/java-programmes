 class Fraction {
    private final int numerator;
    private final int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        } else {
            this.denominator = denominator;
        }
    }

    public String getFraction() {
        return numerator + "/" + denominator;
    }
    public double getFractionDecimal() {
        return ((double) numerator) / denominator;
    }

    // Mathematical functions


    public String addFraction(Fraction otherFraction) {
        // Sum formula: a/b + c/d = (ad + cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subtractFraction(Fraction otherFraction) {
        // Subtraction formula: a/b - c/d = (ad - cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String multiplyByFraction(Fraction otherFraction) {
        // Multiplication formula: a/b * c/d = ac/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*c) + "/" + (b*d);
    }

    public String divideByFraction(Fraction otherFraction) {
        // Division formula: (a/b) / (c/d) = ad/bc
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*d) + "/" + (b*c);
    }
}

class TestFraction {
    public static void main(String[] args) {
        Fraction fraction3_4 = new Fraction(3,4);
        Fraction fraction2_3 = new Fraction(2,3);

        System.out.println("F1: " + fraction3_4.getFraction() + " Dec: " + fraction3_4.getFractionDecimal());
        System.out.println("F2: " + fraction2_3.getFraction() + " Dec: " + fraction2_3.getFractionDecimal() + "\n");
        System.out.println("F1 + F2: " + fraction3_4.addFraction(fraction2_3));
        System.out.println("F2 + F1: " + fraction2_3.addFraction(fraction3_4) + "\n");
        System.out.println("F1 - F2: " + fraction3_4.subtractFraction(fraction2_3));
        System.out.println("F2 - F1: " + fraction2_3.subtractFraction(fraction3_4) + "\n");
        System.out.println("F1 * F2: " + fraction3_4.multiplyByFraction(fraction2_3));
        System.out.println("F2 * F1: " + fraction2_3.multiplyByFraction(fraction3_4) + "\n");
        System.out.println("F1 / F2: " + fraction3_4.divideByFraction(fraction2_3));
        System.out.println("F2 / F1: " + fraction2_3.divideByFraction(fraction3_4));
    }
}
