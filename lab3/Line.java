package ru.Poezhaeva.Geometry;

public class Line
{
    private Point start;
    private Point end;

    // Конструктор из координат
    public Line(double x1, double y1, double x2, double y2)
    {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
        check();
    }

    public Line(Point start, Point end)
    {
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
        check();
    }

    private void check()
    {
        if (start.getX() == end.getX() && start.getY() == end.getY())
        {
            throw new RuntimeException("Ошибка! (начало и конец линии совпадают) ");
        }
    }

    // Геттеры возвращают копии точек
    public Point getStart()
    {
        return new Point(start.getX(), start.getY());
    }

    public Point getEnd()
    {
        return new Point(end.getX(), end.getY());
    }

    public void setStart(double x, double y)
    {
        if (x == end.getX() && y == end.getY())
        {
            throw new RuntimeException("Ошибка! (начало не может совпадать с концом) ");
        }
        this.start = new Point(x, y);
    }

    public void setEnd(double x, double y)
    {
        if (x == start.getX() && y == start.getY())
        {
            throw new RuntimeException("Ошибка! (конец не может совпадать с началом) ");
        }
        this.end = new Point(x, y);
    }

    @Override
    public String toString()
    {
        return "Линия от " + start + " до " + end;
    }
}
