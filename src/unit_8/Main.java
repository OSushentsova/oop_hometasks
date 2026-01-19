package unit_8;

public class Main {
    public static void main(String[] args) {

        // 1. Создаем обычную ломаную (незамкнутую)
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(0, 3);
        Point p5 = new Point(0, 0);

        PolyLine polyLine = new PolyLine(p1, p2, p3, p4);
        System.out.println("\nОбычная ломаная (без замыкания):");
        System.out.println(polyLine.toString());
        System.out.println("Длина: " + polyLine.getLength());
        System.out.println("Проверка isClosed(): " + polyLine.isClosed());

        // 2. Создаем замкнутую ломаную (те же точки, но замкнутая)
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3, p4, p5);
        System.out.println("\nЗамкнутая ломаная:");
        System.out.println(closedPolyLine.toString());
        System.out.println("Длина: " + closedPolyLine.getLength());
        System.out.println("Проверка isClosed(): " + closedPolyLine.isClosed());
    }
}