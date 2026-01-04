class Line {
    Point start;
    Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public double getLength() {
        int deltaX = end.x - start.x;
        int deltaY = end.y - start.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
