package ru.Poezhaeva.Points;

public class Point3D extends AbstractPoint
{
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z)
    {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(double x, double y, double z, String color, String time)
    {
        super(color, time);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x; }

    public double getY() {
        return y; }

    public double getZ() {
        return z; }

    public void setX(double x) {
        this.x = x; }

    public void setY(double y) {
        this.y = y; }

    public void setZ(double z) {
        this.z = z; }

    @Override
    public String getCoordinates()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
