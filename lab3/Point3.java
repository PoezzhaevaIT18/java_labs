package ru.Poezhaeva.Geometry;

public class Point3 extends Point
{
    private double z;

    public Point3()
    {
        super();
        this.z = 0;
    }

    public Point3(double x, double y, double z)
    {
        super(x, y);
        this.z = z;
    }

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    @Override
    public String toString()
    {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

}
