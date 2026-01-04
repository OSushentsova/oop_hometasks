public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 8);
        Point point3 = new Point(10, 11);
        Point point4 = new Point(15, 19);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.end, line2.start);

        System.out.println("Линия 3 до изменений: " + line3);

        line1.end.x = 20;
        line1.end.y = 25;

        line2.start.x = 30;
        line2.start.y = 35;

        System.out.println("Линия 3 после изменений: " + line3);

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех линий: " + totalLength);

    }
}