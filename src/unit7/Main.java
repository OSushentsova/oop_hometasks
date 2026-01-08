package unit7;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);  // 1/3
        Fraction f2 = new Fraction(2, 5);  // 2/5
        Fraction f3 = new Fraction(7, 8);  // 7/8

        System.out.println("Созданы дроби:");
        System.out.println("f1 = " + f1 + " ≈ " + f1.toDouble());
        System.out.println("f2 = " + f2 + " ≈ " + f2.toDouble());
        System.out.println("f3 = " + f3 + " ≈ " + f3.toDouble());

        Fraction result = f1.sum(f2).sum(f3).minus(5);
        System.out.println("Результат f1.sum(f2).sum(f3).minus(5):");
        System.out.println("В виде дроби: " + result);
        System.out.println("В десятичном виде: " + result.toDouble());
    }
}
