import java.util.Scanner;
public class Metod {

    public double fraction(double x) {                               //1 задание
        return x - (int) x;
    }

    public int charToNum(char c) {                                  // 2 задание
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        return -1;
    }

    public boolean is2Digits(int x) {                              // 3 задание
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public boolean isInRange(int a, int b, int num) {             // 4 задание
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    public boolean isEqual(int a, int b, int c) {                 // 5 задание
        return a == b && b == c;
    }

    public int abs(int x) {                                       // 6 задание
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public boolean is35(int x) {                                  // 7 задание
        boolean divisible3 = (x % 3 == 0);
        boolean divisible5 = (x % 5 == 0);
        return (divisible3 || divisible5) && !(divisible3 && divisible5);
    }

    public int max3(int x, int y, int z) {                        // 8 задание
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public int sum2(int x, int y) {                               // 9 задание
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        else {
            return sum;
        }
    }

    public String day(int x) {                                   // 10 задание
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public String listNums(int x) {                              // 11 задание
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public String chet(int x) {                                   // 12 задание
        StringBuilder chNum = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            chNum.append(i);
            if (i < x) {
                chNum.append(" ");
            }
        }
        return chNum.toString();
    }

    public int numLen(long x) {                                   // 13 задание
        if (x == 0) {
            return 1;
        }
        int length = 0;
        long number = Math.abs(x);

        while (number > 0) {
            number = number / 10;
            length++;
        }

        return length;
    }

    public void square(int x) {                                  // 14 задание
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {                           // 15 задание
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {                    // 16 задание
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {                              // 17 задание
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxAbsValue = arr[0];
        int maxAbs = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs > maxAbs) {
                maxAbs = currentAbs;
                maxAbsValue = arr[i];
            }
            else if (currentAbs == maxAbs) {
                if (arr[i] < 0) {
                    maxAbsValue = arr[i];
                }
            }
        }
        return maxAbsValue;
    }

    public int[] add(int[] arr, int[] ins, int pos) {           //  18 задание
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    public int[] reverseBack(int[] a) {                         // 19 задание
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - 1 - i];
        }

        return result;
    }

    public int[] findAll(int[] arr, int x) {                    //20 задание
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}
