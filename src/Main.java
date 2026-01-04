public class Main {
    static Point point1 = new Point(1, 3);
    static Point point2 = new Point(1, 3);
    static Point point3 = new Point(1, 5);

    public static void main(String[] args) {
        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);

        System.out.println("  point1 == point2: " + (point1 == point2));
        System.out.println("  point1 == point3: " + (point1 == point3));
        System.out.println("  point2 == point3: " + (point2 == point3));
    }
}