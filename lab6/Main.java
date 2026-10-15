import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1 - 6): ");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {
            case 1: {
                try {
                    TestClass testObj = new TestClass();
                    InvokeHandler handler = new InvokeHandler();
                    System.out.println("Автоматический вызов методов с @Invoke: ");
                    handler.autoInvoke(testObj);
                    System.out.println("Ручной вызов всех методов для сравнения: ");
                    testObj.method1();
                    testObj.method2();
                    testObj.method3();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                DefaultHandler handler = new DefaultHandler();
                System.out.println("Демонстрация аннотации @Default: ");
                handler.processClass(TestClass2.class);
                break;
            }
            case 3: {
                try {
                    ToStringHandler handler = new ToStringHandler();
                    TestClass3 obj = new TestClass3();
                    System.out.println("Демонстрация аннотации @ToString: ");
                    String result = handler.generateToString(obj);
                    System.out.println("Все поля объекта:");
                    System.out.println("name: " + obj.getName());
                    System.out.println("age: " + obj.getAge());
                    System.out.println("email: " + obj.getEmail());
                    System.out.println("salary: " + obj.getSalary());
                    System.out.println("Строковое представление: " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                ValidateHandler handler = new ValidateHandler();
                System.out.println("Демонстрация @Validate: ");
                handler.showClasses(TestClass4.class);
                break;
            }
            case 5: {
                TwoHandler handler = new TwoHandler();
                System.out.println("Демонстрация аннотации @Two: ");
                handler.processClass(TestClass5.class);
                break;
            }
            case 6: {
                CacheHandler handler = new CacheHandler();
                System.out.println("Демонстрация аннотации @Cache: ");
                handler.processClass(TestClass6.class);
                handler.processClass(EmptyCacheClass.class);
                break;
            }
        }
    }
}