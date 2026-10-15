package ru.Poezhaeva.Points;

public class Point2D extends AbstractPoint
{
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    public Point2D(double x, double y, String color, String time)
    {
        super(color, time);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x; }

    public double getY() {
        return y; }

    public void setX(double x) {
        this.x = x; }

    public void setY(double y) {
        this.y = y; }

    @Override
    public String getCoordinates()
    {
        return "(" + x + ", " + y + ")";
    }
}
