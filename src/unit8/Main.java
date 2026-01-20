package unit8;

public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(3, 4);

        System.out.println("Дробь: " + f);
        System.out.println("intValue: " + f.intValue());
        System.out.println("doubleValue: " + f.doubleValue());
        System.out.println("floatValue: " + f.floatValue());

        // Использование как Number
        Number num = f;
        System.out.println("\nКак Number:");
        System.out.println("intValue: " + num.intValue());
        System.out.println("doubleValue: " + num.doubleValue());
    }
}
