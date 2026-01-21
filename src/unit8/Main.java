package unit8;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Пример 1: 2 + 3/5 + 2.3
        System.out.println("Пример 1: 2 + 3/5 + 2.3");
        Fraction f1 = new Fraction(3, 5);
        System.out.println("Результат: " + calc.sumAll(2, f1, 2.3));
        System.out.println("Ожидаемый: 4.9");

        // Пример 2: 3.6 + 49/12 + 3 + 3/2
        System.out.println("\nПример 2: 3.6 + 49/12 + 3 + 3/2");
        Fraction f2a = new Fraction(49, 12);
        Fraction f2b = new Fraction(3, 2);
        System.out.println("Результат: " + calc.sumAll(3.6, f2a, 3, f2b));
        System.out.println("Ожидаемый: 12.183333...");

        // Пример 3: 1/3 + 1
        System.out.println("\nПример 3: 1/3 + 1");
        Fraction f3 = new Fraction(1, 3);
        System.out.println("Результат: " + calc.sumAll(f3, 1));
        System.out.println("Ожидаемый: 1.333333...");
    }
}
