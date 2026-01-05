public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);

        BrokenLine brokenLine = new BrokenLine(p1, p2, p3, p4);
        System.out.println("1. Создана ломаная: " + brokenLine);

        double brokenLineLength = brokenLine.getLength();
        System.out.println("2. Длина ломаной: " + brokenLineLength);

        Line[] lines = brokenLine.getLines();
        System.out.println("3. Получен массив линий:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println("   Линия " + (i + 1) + ": " + lines[i] +
                    ", длина: " + lines[i].getLength());
        }

        double linesLength = 0.0;
        for (int i = 0; i < lines.length; i++) {
            linesLength += lines[i].getLength();
        }
        System.out.println("4. Суммарная длина массива линий: " + linesLength);

        System.out.println("5. Сравнение длин:");
        System.out.println("   Длина ломаной: " + brokenLineLength);
        System.out.println("   Длина массива линий: " + linesLength);
        System.out.println("   Совпадают? " + (Math.abs(brokenLineLength - linesLength) < 0.0001));

        Point pointToChange = brokenLine.getPoint(1);
        System.out.println("   До изменения: " + pointToChange);

        pointToChange.x = 12;
        pointToChange.y = 8;

        System.out.println("   После изменения: " + pointToChange);
        System.out.println("   Ломаная после изменения: " + brokenLine);

        System.out.println("   Проверка изменений:");
        System.out.println("   - В ломаной: " + brokenLine.getPoint(1));

        Line[] updatedLines = brokenLine.getLines();
        System.out.println("   - В первой линии массива (начало): " + updatedLines[0].start);
        System.out.println("   - Во второй линии массива (конец): " + updatedLines[1].end);

    }
}