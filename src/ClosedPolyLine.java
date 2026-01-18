class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {
        double baseLength = super.length();

        // Вычисляем расстояние от последней точки до первой
        if (getPointCount() > 1) {
            Point first = getPoint(0);
            Point last = getPoint(getPointCount() - 1);
            double len1 = first.getX() - last.getX();
            double len2 = first.getY() - last.getY();
            baseLength += Math.sqrt(len1 * len1 + len2 * len2);
        }

        return baseLength;
    }

    private static Point[] createPointsFromCoords(int... coords) {
        if (coords.length % 2 != 0) {
            throw new IllegalArgumentException("Количество координат должно быть четным");
        }

        Point[] points = new Point[coords.length / 2];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(coords[i * 2], coords[i * 2 + 1]);
        }
        return points;
    }

    @Override
    public boolean isClosed() {
        if (getPointCount() < 2) {
            return false;
        }
        Point first = getPoint(0);
        Point last = getPoint(getPointCount() - 1);
        return first.getX() == last.getX() && first.getY() == last.getY();
    }

    @Override
    public String toString() {
        return "Closed" + super.toString();
    }
}