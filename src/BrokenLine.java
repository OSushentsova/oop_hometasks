import java.util.Arrays;

class BrokenLine {
    private Point[] points;

    BrokenLine() {
        this.points = new Point[0];
    }

    BrokenLine(Point... points) {
        this.points = Arrays.copyOf(points, points.length);
    }

    public String toString() {
        if (points.length == 0) {
            return "Ломаная []";
        }
        StringBuilder sb = new StringBuilder("Ломаная [");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Line[] getLines() {
        if (points.length < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength() {
        double length = 0.0;
        Line[] lines = getLines();
        for (int i = 0; i < lines.length; i++) {
            length += lines[i].getLength();
        }
        return length;
    }
    public Point getPoint(int index) {
        if (index >= 0 && index < points.length) {
            return points[index];
        }
        return null;
    }
}
