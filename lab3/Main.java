import java.util.Scanner;
import ru.Poezhaeva.Geometry.Point;
import ru.Poezhaeva.Geometry.Line;
import ru.Poezhaeva.Geometry.Point3;
import ru.Poezhaeva.Points.Point1D;
import ru.Poezhaeva.Points.Point3D;
import ru.Poezhaeva.Points.Point2D;
import ru.Poezhaeva.LineComparison.Line2;
import ru.Poezhaeva.LineComparison.Point1;
import ru.Poezhaeva.Operation.Summable;
import ru.Poezhaeva.Operation.SumCalculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1-8): ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                try {
                    System.out.println("Создание первой линии: ");
                    double x1 = Point.inputCoordinate("X1", scanner);
                    double y1 = Point.inputCoordinate("Y1", scanner);
                    double x2 = Point.inputCoordinate("X2", scanner);
                    double y2 = Point.inputCoordinate("Y2", scanner);
                    Line line1 = new Line(x1, y1, x2, y2);
                    System.out.println("Создана линия 1: " + line1);
                    // Для второй линии переопределяем те же переменные:
                    System.out.println("Создание второй линии: ");
                    x1 = Point.inputCoordinate("X1", scanner);  // перезаписываем x1
                    y1 = Point.inputCoordinate("Y1", scanner);
                    x2 = Point.inputCoordinate("X2", scanner);
                    y2 = Point.inputCoordinate("Y2", scanner);
                    Line line2 = new Line(x1, y1, x2, y2);
                    System.out.println("Создана линия 2: " + line2);
                    System.out.println("Изменим начало первой линии: ");
                    double newX = Point.inputCoordinate("Новое X начала", scanner);
                    double newY = Point.inputCoordinate("Новое Y начала", scanner);
                    line1.setStart(newX, newY);
                    System.out.println("После изменения: " + line1);
                    System.out.println("Проверка уникальности точек: ");
                    System.out.println("Разные адреса в памяти: " + (line1.getStart() != line1.getStart()));
                    System.out.println("Выводим линии: ");
                    System.out.println(line1);
                    System.out.println(line2);
                } catch (RuntimeException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                } finally {
                    scanner.close();
                }
                break;

            case 3:
                System.out.println("Создание точки с тремя координатами: ");
                try {
                    double x = Point.inputCoordinate("X", scanner);
                    double y = Point.inputCoordinate("Y", scanner);
                    double z = Point.inputCoordinate("Z", scanner);
                    Point3 point3D = new Point3(x, y, z);
                    System.out.println("Создана точка: " + point3D);
                    System.out.println("Отдельные координаты:");
                    System.out.println("X = " + point3D.getX());
                    System.out.println("Y = " + point3D.getY());
                    System.out.println("Z = " + point3D.getZ());
                    System.out.println("Изменим координату Z: ");
                    double newZ = Point.inputCoordinate("новое Z", scanner);
                    point3D.setZ(newZ);
                    System.out.println("После изменения: " + point3D);
                } catch (RuntimeException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;
            case 4:
                System.out.println("Точки с характеристиками: ");
                Point2D p1d = new Point2D(4, 7, "жёлтый", "15:35");
                Point3D p2d = new Point3D(4, 2, 5, "синий", "11:00");
                Point2D p3d = new Point2D(3, 22);
                Point1D p4d = new Point1D(2);
                Point2D p5d = new Point2D(1, 1, "красный", "19:48");
                Point1D p6d = new Point1D(33, "коричневый", "22:22");
                System.out.println(p1d);
                System.out.println(p2d);
                System.out.println(p3d);
                System.out.println(p4d);
                System.out.println(p5d);
                System.out.println(p6d);
                break;
            case 5:
                Summable calculator = new SumCalculator();
                double result1 = calculator.sum(2, 3.0 / 5, 2.3);
                System.out.println("2 + 3/5 + 2.3 = " + result1);
                double result2 = calculator.sum(3.6, 49.0 / 12, 3, 3.0 / 2);
                System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);
                double result3 = calculator.sum(1.0 / 3, 1);
                System.out.println("1/3 + 1 = " + result3);
                break;
            case 6:
                System.out.println("Введите координаты первой линии:");
                Line2 line1 = new Line2(Point1.input("Начало", scanner),
                        Point1.input("Конец", scanner));

                System.out.println("Введите координаты второй линии:");
                Line2 line2 = new Line2(Point1.input("Начало", scanner),
                        Point1.input("Конец", scanner));

                System.out.println("Линия 1: " + line1);
                System.out.println("Линия 2: " + line2);

                System.out.println(line1.equals(line2) ? "Линии одинаковые" : "Линии разные");
                break;

        }
    }
}