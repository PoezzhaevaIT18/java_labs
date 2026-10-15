package ru.Poezhaeva.Points;

public abstract class AbstractPoint
{
    protected String color;
    protected String time;

    //конструкор с характеристиками
    public AbstractPoint()
    {
        this.color = "без цвета";
        this.time = "неизвестно";
    }

    //конструктор без характеристик
    public AbstractPoint(String color, String time)
    {
        this.color = color;
        this.time = time;
    }

    public String getColor() {
        return color; }

    public String getTime() {
        return time; }

    public void setColor(String color) {
        this.color = color; }

    public void setTime(String time) {
        this.time = time; }

    // Абстрактный метод для координат
    public abstract String getCoordinates();

    @Override
    public String toString()
    {
        return getCoordinates() + ", цвет: " + color + ", время: " + time;
    }
}
