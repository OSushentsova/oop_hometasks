package unit_8;

class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double getLength() {
        double length = super.getLength();

        if (points.length > 1) {
            double dx = points[points.length-1].getX() - points[0].getX();
            double dy = points[points.length-1].getY() - points[0].getY();
            length += Math.sqrt(dx*dx + dy*dy);
        }

        return length;
    }

    @Override
    public boolean isClosed() {
        if (points.length < 2) return false;
        return points[0].getX() == points[points.length-1].getX() &&
                points[0].getY() == points[points.length-1].getY();
    }

    @Override
    public String toString() {
        return "Closed" + super.toString();
    }
}