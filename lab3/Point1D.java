package ru.Poezhaeva.Points;

public class Point1D extends AbstractPoint
{
    private double x;

    public Point1D(double x)
    {
        super();
        this.x = x;
    }

    public Point1D(double x, String color, String time)
    {
        super(color, time);
        this.x = x;
    }

    public double getX() {
        return x; }
    public void setX(double x) {
        this.x = x; }

    @Override
    public String getCoordinates()
    {
        return "(" + x + ")";
    }
}
