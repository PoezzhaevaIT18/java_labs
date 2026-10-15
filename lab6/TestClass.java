public class TestClass {

    @Invoke
    public void method1() {
        System.out.println("Метод 1 вызван!");
    }

    public void method2() {
        System.out.println("Метод 2 вызван!");
    }

    @Invoke
    public void method3() {
        System.out.println("Метод 3 вызван!");
    }
}