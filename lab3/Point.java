package ru.Poezhaeva.Geometry;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Point
{
    private double x;
    private double y;

    public Point() { }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public static double inputCoordinate(String name, Scanner scanner)
    {
        while (true)
        {
            try
            {
                System.out.print("Введите координату " + name + ": ");
                return scanner.nextDouble();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ошибка: введите число!");
                scanner.nextLine();
            }
        }
    }
}
