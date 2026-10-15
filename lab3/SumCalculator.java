package ru.Poezhaeva.Operation;

public class SumCalculator implements Summable {
    @Override
    public double sum(double... numbers) {
        double total = 0;
        for (double num : numbers) { //перебор массива
            total += num;
        }
        return total;
    }
}
