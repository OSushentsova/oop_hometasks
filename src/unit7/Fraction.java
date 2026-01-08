package unit7;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        } else if (numerator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } else if (denominator < 0) {
            throw new IllegalArgumentException("Для знаменателя отрицательное значение недопустимо");
        }
        int gcd = gcd(Math.abs(numerator), denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public String toString() {
            return numerator + "/" + denominator;
        }
        // Операция сложения с другой дробью
        public Fraction sum(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        // Операция сложения с целым числом
        public Fraction sum(int number) {
            Fraction numberAsFraction = new Fraction(number, 1);
            return this.sum(numberAsFraction);
        }

        // Операция вычитания с другой дробью
        public Fraction minus(Fraction other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        // Операция вычитания целого числа
        public Fraction minus(int number) {
            Fraction numberAsFraction = new Fraction(number, 1);
            return this.minus(numberAsFraction);
        }
        // Преобразование в десятичное число
        public double toDouble() {
            return (double) numerator / denominator;
        }
    }

