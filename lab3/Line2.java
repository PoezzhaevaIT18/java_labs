package ru.Poezhaeva.LineComparison;

public class Line2 {
    private Point1 start;
    private Point1 end;

    public Line2(Point1 start, Point1 end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line2)) return false;
        Line2 other = (Line2) obj;
        return start.getX() == other.start.getX() &&
                start.getY() == other.start.getY() &&
                end.getX() == other.end.getX() &&
                end.getY() == other.end.getY();
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}
