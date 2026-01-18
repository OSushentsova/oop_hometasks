import java.util.Arrays;

class PolyLine {

    private Point[] points;

    public PolyLine(Point... points) {
        if (points == null) {
            this.points = new Point[0];
        } else {
            this.points = Arrays.copyOf(points, points.length);
        }
    }

    public int getPointCount() {
        return points.length;
    }

    // Метод для получения точки по индексу
    public Point getPoint(int index) {
        if (index < 0 || index >= points.length) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + points.length);
        }
        return points[index];
    }


    public double length() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double len1 = points[i].getX() - points[i + 1].getX();
            double len2 = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    public boolean isClosed() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolyLine[");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(" → ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}