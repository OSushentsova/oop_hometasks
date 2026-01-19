package unit_8;

class Line implements Measurable {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
