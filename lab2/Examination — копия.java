import java.util.Scanner;

public class Examination {
    Scanner scanner = new Scanner(System.in);
    public double Coordinate(String coordinateName) {
        double n;
        while (true) {
            System.out.print("Введите координату " + coordinateName + ": ");
            if (scanner.hasNextDouble()) {
                n = scanner.nextDouble();
                scanner.nextLine();
                return n;
            } else {
                System.out.println("Ошибка! Пожалуйста введите число: ");
                scanner.nextLine();
            }
        }
    }
}
