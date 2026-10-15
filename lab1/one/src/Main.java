import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер блока задач (1-4): ");
        number1 = scanner.nextInt();
        switch (number1) {
            case 1:
                System.out.println("Введите номер подзадания (1-5): ");
                number2 = scanner.nextInt();
                switch (number2) {
                    case 1:
                        Metod x = new Metod();
                        System.out.println("Дробная часть числа x:");
                        System.out.println("Введите вещественное число: ");
                        DecimalFormat df = new DecimalFormat("#.######");
                        if (scanner.hasNextDouble()) {
                            double number = scanner.nextDouble();
                            double fractionalPart = x.fraction(number);
                            String formattedFraction = df.format(fractionalPart);
                            System.out.println("Дробная часть числа: " + formattedFraction);
                        }
                        else {
                            System.out.println("Ошибка, нужно было ввести вещественное число! ");
                        }
                        break;
                    case 2:
                        scanner.nextLine();
                        Metod x2 = new Metod();
                        System.out.println("Символ в число:");
                        System.out.println("Введите символ (от 0 до 9): ");
                        String input = scanner.nextLine();
                        System.out.println("Вы ввели: '" + input + "'");
                        if (input.length() != 1) {
                            System.out.println("Ошибка: введите ровно один символ!");
                        }
                        else {
                            char symbol = input.charAt(0);
                            int res = x2.charToNum(symbol);
                            if (res == -1) {
                                System.out.println("Ошибка: символ должен быть цифрой от 0 до 9!");
                            }
                            else {
                                System.out.println("Символ '" + symbol + "' преобразован в число: " + res);
                            }
                        }
                        break;
                    case 3:
                        Metod x3 = new Metod();
                        int num;
                        System.out.println("Проверка на двузначность:");
                        System.out.print("Введите целое число: ");
                        num = scanner.nextInt();
                        if (x3.is2Digits(num)) {
                            System.out.println("Число: " + num);
                            System.out.println("Двузначное: true");
                        }
                        else {
                            System.out.println("Проверка на двузначность:");
                            System.out.println("Число: " + num);
                            System.out.println("Двузначное: false");
                        }
                        break;

                    case 4:
                        Metod x4 = new Metod();
                        System.out.println("Проверка диапазона, определяем границы и проверяем, входит ли туда число: ");
                        System.out.print("Введите границу a: ");
                        int a = scanner.nextInt();
                        System.out.print("Введите границу b: ");
                        int b = scanner.nextInt();
                        System.out.print("Введите число для проверки: ");
                        int checkNum = scanner.nextInt();
                        boolean inRange = x4.isInRange(a, b, checkNum);
                        System.out.println("Границы: [" + Math.min(a, b) + ", " + Math.max(a, b) + "]");
                        System.out.println("Проверяемое число: " + checkNum);
                        System.out.println("Входит в диапазон: " + (inRange ? "true" : "false"));
                        break;

                    case 5:
                        Metod x5 = new Metod();
                        System.out.println("Проверка равенства чисел:");
                        System.out.print("Введите число a: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Введите число b: ");
                        int num2 = scanner.nextInt();
                        System.out.print("Введите число c: ");
                        int num3 = scanner.nextInt();
                        boolean areEqual = x5.isEqual(num1, num2, num3);
                        System.out.println("Числа: " + num1 + ", " + num2 + ", " + num3);
                        System.out.println("Все числа равны: " + (areEqual ? "true" : "false"));
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;

            case 2:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x21 = new Metod();
                        System.out.println("Модуль числа:");
                        System.out.print("Введите число: ");
                        int number = scanner.nextInt();
                        int absoluteValue = x21.abs(number);
                        System.out.println("Исходное число: " + number);
                        System.out.println("|" + number + "| = " + absoluteValue);
                        break;

                    case 2:
                        Metod x22 = new Metod();
                        System.out.println("35 (true - делится нацело на 3 или на 5, иначе false)");
                        System.out.print("Введите число: ");
                        int num = scanner.nextInt();
                        boolean result = x22.is35(num);
                        System.out.println("Число: " + num);
                        System.out.println("Делится на 3: " + ((num % 3 == 0) ? "да" : "нет"));
                        System.out.println("Делится на 5: " + ((num % 5 == 0) ? "да" : "нет"));
                        System.out.println("Результат: " + (result ? "true" : "false"));
                        break;

                    case 3:
                        Metod x23 = new Metod();
                        System.out.println("Тройной максимум (из чисел будет выбрано наибольшее):");
                        System.out.print("Введите число x: ");
                        int x = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        int y = scanner.nextInt();
                        System.out.print("Введите число z: ");
                        int z = scanner.nextInt();
                        int max = x23.max3(x, y, z);
                        System.out.println("Числа: x=" + x + ", y=" + y + ", z=" + z);
                        System.out.println("Максимальное число: " + max);
                        break;

                    case 4:
                        Metod x24 = new Metod();
                        System.out.println("Двойная сумма (выводит сумму, за исключением если сумма попадает в диапазон от 10-19)");
                        System.out.print("Введите число x: ");
                        int xNum = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        int yNum = scanner.nextInt();
                        int sumResult = x24.sum2(xNum, yNum);
                        System.out.println("Числа: x=" + xNum + ", y=" + yNum);
                        System.out.println("Сумма: " + xNum + " + " + yNum + " = " + (xNum + yNum));
                        System.out.println("Результат: " + sumResult);
                        break;

                    case 5:
                        Metod x25 = new Metod();
                        System.out.print("Введите номер дня недели (1-7): ");
                        int dayNumber = scanner.nextInt();
                        String dayName = x25.day(dayNumber);
                        System.out.println("Номер дня: " + dayNumber);
                        System.out.println("День недели: " + dayName);
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;
            case 3:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x31 = new Metod();
                        System.out.print("Введите число x, которое будет разложенно от 0 до x: ");
                        int xNum = scanner.nextInt();
                        String numbersList = x31.listNums(xNum);
                        System.out.println("Числа подряд: ");
                        System.out.println("Число x: " + xNum);
                        System.out.println("Результат: " + numbersList);
                        break;

                    case 2:
                        Metod x32 = new Metod();
                        System.out.print("Введите число x, которое будет разложено на четные числа: ");
                        int xValue = scanner.nextInt();
                        String evenNumbers = x32.chet(xValue);
                        System.out.println("Число x: " + xValue);
                        System.out.println("Результат: \"" + evenNumbers + "\"");
                        break;

                    case 3:
                        Metod x33 = new Metod();
                        System.out.println("Программа считает количество цифр: ");
                        System.out.print("Введите целое число: ");
                        long longNumber = scanner.nextLong();
                        int length = x33.numLen(longNumber);
                        System.out.println("Число: " + longNumber + ", количество цифр: " + length);
                        break;

                    case 4:
                        Metod x34 = new Metod();
                        System.out.print("Введите размер квадрата: ");
                        int size = scanner.nextInt();
                        System.out.println("Квадрат " + size + "x" + size + ":");
                        x34.square(size);
                        break;

                    case 5:
                        Metod x35 = new Metod();
                        System.out.print("Введите высоту треугольника: ");
                        int h = scanner.nextInt();
                        System.out.println("Треугольник высотой " + h + ":");
                        x35.rightTriangle(h);
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;

            case 4:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x41 = new Metod();
                        System.out.println("Программа возвращает индекс первого вхождения числа в массив. ");
                        System.out.print("Введите размер массива: ");
                        int size = scanner.nextInt();
                        int[] array = new int[size];
                        System.out.print("Введите элементы массива: ");
                        for (int i = 0; i < size; i++) {
                            array[i] = scanner.nextInt();
                        }
                        System.out.print("Введите число для поиска: ");
                        int searchNumber = scanner.nextInt();
                        System.out.print("Массив: ");
                        for (int num : array) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        System.out.println("Искомое число: " + searchNumber);
                        int result = x41.findFirst(array, searchNumber);
                        if (result != -1) {
                            System.out.println("Первое вхождение найдено по индексу: " + result);
                        }
                        else {
                            System.out.println("Число не найдено в массиве");
                        }
                        break;

                    case 2:
                        Metod x42 = new Metod();
                        System.out.print("Введите размер массива: ");
                        int arr = scanner.nextInt();
                        int[] array2 = new int[arr];
                        System.out.print("Введите элементы массива: ");
                        for (int i = 0; i < arr; i++) {
                            array2[i] = scanner.nextInt();
                        }
                        System.out.print("Массив: ");
                        for (int num : array2) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        int maxAbsResult = x42.maxAbs(array2);
                        System.out.println("Наибольшее по модулю значение: " + maxAbsResult);
                        break;

                    case 3:
                        Metod x43 = new Metod();
                        System.out.println("Добавляем один массив в другой с указаной позицией: ");
                        System.out.println("Ввод первого массива: ");
                        System.out.print("Количество элементов в первом массиве: ");
                        int size1 = scanner.nextInt();
                        if (size1 <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным числом!");
                            break;
                        }
                        int[] mainArray = new int[size1];
                        System.out.println("Введите " + size1 + " чисел:");
                        for (int i = 0; i < size1; i++) {
                            mainArray[i] = scanner.nextInt();
                        }
                        System.out.println("\nВвод массива для вставки:");
                        System.out.print("Количество элементов во втором массиве: ");
                        int size2 = scanner.nextInt();
                        if (size2 <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным числом!");
                            break;
                        }
                        int[] insertArray = new int[size2];
                        System.out.println("Введите " + size2 + " чисел:");
                        for (int i = 0; i < size2; i++) {
                            insertArray[i] = scanner.nextInt();
                        }
                        System.out.println("\nВыбор позиции:");
                        System.out.print("На какую позицию вставить: (0-" + size1 + "): ");
                        int position = scanner.nextInt();
                        if (position < 0 || position > size1) {
                            System.out.println("Ошибка: позиция вставки вне допустимого диапазона!");
                            break;
                        }
                        System.out.println("\nРезультат");
                        System.out.print("Первый массив: ");
                        for (int num : mainArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        System.out.print("Вставляемый массив: ");
                        for (int num : insertArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        System.out.println("Позиция вставки: " + position);
                        int[] resultArray = x43.add(mainArray, insertArray, position);
                        System.out.print("Итоговый массив: ");
                        for (int num : resultArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;

                    case 4:
                        Metod x44 = new Metod();
                        System.out.println("Реверс массива(обратный): ");
                        System.out.print("Сколько элементов в массиве? ");
                        int s = scanner.nextInt();
                        if (s <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным числом!");
                            break;
                        }
                        int[] a = new int[s];
                        System.out.println("Введите " + s + " чисел:");
                        for (int i = 0; i < s; i++) {
                            a[i] = scanner.nextInt();
                        }
                        System.out.println("\nРезультат");
                        System.out.print("Исходный массив: ");
                        for (int num : a) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        int[] reversedArray = x44.reverseBack(a);
                        System.out.print("Перевернутый массив: ");
                        for (int num : reversedArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                        break;

                    case 5:
                        Metod x45 = new Metod();
                        System.out.println("Поиск всех вхождений: ");
                        System.out.print("Сколько элементов в массиве? ");
                        int m = scanner.nextInt();
                        if (m <= 0) {
                            System.out.println("Ошибка: размер массива должен быть положительным числом!");
                            break;
                        }
                        int[] ar = new int[m];
                        System.out.println("Введите " + m + " чисел:");
                        for (int i = 0; i < m; i++) {
                            ar[i] = scanner.nextInt();
                        }
                        System.out.print("Какое число ищем? ");
                        int num = scanner.nextInt();
                        System.out.println("\nРезультат");
                        System.out.print("Массив: ");
                        for (int value : ar) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                        System.out.println("Искомое число: " + num);
                        int[] foundIndices = x45.findAll(ar, num);
                        if (foundIndices.length > 0) {
                            System.out.print("Индексы вхождений: ");
                            for (int index : foundIndices) {
                                System.out.print(index + " ");
                            }
                            System.out.println();
                            System.out.println("Количество вхождений: " + foundIndices.length);
                        }
                        else {
                            System.out.println("Число " + num + " не найдено в массиве");
                        }
                        break;

                    default:
                        System.out.println("Неверный номер подзадания!");
                }
                break;
        }
    }
}
