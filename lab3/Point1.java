package ru.Poezhaeva.LineComparison;

import java.util.Scanner;

public class Point1 {
    private double x;
    private double y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x; }
    public double getY() {
        return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Проверка для ввода с клавиатуры
    public static Point1 input(String name, Scanner scanner) {
        double x = inputDouble(name + " X", scanner);
        double y = inputDouble(name + " Y", scanner);
        return new Point1(x, y);
    }

    // Метод для безопасного ввода числа
    private static double inputDouble(String prompt, Scanner scanner) {
        while (true) {
            System.out.print(prompt + ": ");
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                scanner.nextLine();
                return val;
            } else {
                System.out.println("Ошибка: введите число!");
                scanner.nextLine();
            }
        }
    }
}
