public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        Examination examination = new Examination();
        // 1 задание
        for (int i = 0; i < points.length; i++) {
            System.out.println("Введите координаты точки " + (i + 1) + ": ");
            double x = examination.Coordinate("x");
            double y = examination.Coordinate("y");
            points[i] = new Point(x, y);
        }
        System.out.println("1.1, созданные точки: ");
        for (Point point : points) {
            System.out.println(point);
        }
        // 2 задание
        // 2.1 Линия 1 с началом в т. {1;3} и концом в т. {23;8}
        Point line1Start = new Point(1, 3);
        Point line1End = new Point(23, 8);
        Line line1 = new Line(line1Start, line1End);
        // 2.2 Линия 2, горизонтальная, на высоте 10,от точки 5 до точки 25
        Point line2Start = new Point(5, 10);
        Point line2End = new Point(25, 10);
        Line line2 = new Line(line2Start, line2End);
        // 2.3 Линия 3, которая начинается там же, где линия 1 и заканчивается там же, где линия 2
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println("2.1-2.3, выводим линии: ");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        // 2.4 Изменяем координаты 1 и 2 линии, но чтобы координаты 3 линии соответствовали 3 пункту
        line1Start = new Point(1, 18);
        line2End = new Point(15, 10);

        line1 = new Line(line1Start, line1End);
        line2 = new Line(line2Start, line2End);
        line3 = new Line(line1.getStart(), line2.getEnd());

        System.out.println("2.4, после изменения координат 1 и 2 линии: ");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        // 2.5 Измените координаты 1 линии так, чтобы при этом не изменились, координаты 3 линии
        line1Start = new Point(1, 18);
        line1End = new Point(-7, 5);
        line1 = new Line(line1Start, line1End);
        System.out.println("2.5, после измнения координат 1 линии: ");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);


        //3 задание
        // 3.1, создать студента Васю с оценками: 3, 4, 5.
        System.out.println("3, оценки студентов: ");
        int[] vasyaGrades = {3, 4, 5};
        Student vasya = new Student("Вася", vasyaGrades);
        // 3.2, создать студента Петю и скопировать оценки Васи,присвоив содержимое поля с оценками Васи полю с оценками Пети.
        Student petya = new Student("Петя", vasyaGrades);
        // 3.3, заменить первую оценку Пети на число 5.
        petya.setGrade(0, 5);
        System.out.println(vasya);
        System.out.println(petya);
        // 3.4, создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи не влияло на Андрея.
        Student andrey = new Student("Андрей", vasyaGrades);
        vasya.setGrade(0, 2);
        System.out.println(vasya);
        System.out.println(andrey);

        // 4 задание
        //4. 1 создать объект точки можно только путем указания обеих координат: X и Y, создать и вывести:
        Point point1 = new Point(3, 5);
        Point point2 = new Point(25, 6);
        Point point3 = new Point(7, 8);
        System.out.println("4.1, вывод точек: ");
        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);

        //4. 2 создаем линии
        //Создание Линии возможно с указанием координат начала и конца как четырех чисел (x1,y1,x2,y2)
        Point lineOneStart = new Point(1, 3);
        Point lineOneEnd = new Point(23, 8);
        Line lineOne = new Line(lineOneStart, lineOneEnd);
        Line lineTwo = new Line(5, 10, 25, 10);
        Line lineThree = new Line(lineOne.getStart(), lineTwo.getEnd());

        System.out.println("4.2, вывод линий: ");
        System.out.println("Линия 1: " + lineOne);
        System.out.println("Линия 2: " + lineTwo);
        System.out.println("Линия 3: " + lineThree);

        //5 задание
        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(10.0, 15.0);
        Line line = new Line(pointOne, pointTwo);
        System.out.println("5, длина линии =  " + line.length());

    }
}
