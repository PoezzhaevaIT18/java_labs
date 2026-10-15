public class TwoHandler {

    public void processClass(Class<?> clazz) {

        if (clazz.isAnnotationPresent(Two.class)) {
            Two annotation = clazz.getAnnotation(Two.class);
            String firstValue = annotation.first();
            int secondValue = annotation.second();
            System.out.println("Аннотация @Two найдена в классе: " + clazz.getSimpleName());
            System.out.println("first: '" + firstValue + "'");
            System.out.println("second: " + secondValue);
        } else {
            System.out.println("Аннотация @Two не найдена");
        }
    }
}