package unit_8;

class PolyLine implements Measurable {

    protected Point[] points;
    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double dx = points[i+1].getX() - points[i].getX();
            double dy = points[i+1].getY() - points[i].getY();
            length += Math.sqrt(dx*dx + dy*dy);
        }
        return length;
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