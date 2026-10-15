public class ValidateHandler {

    public void showClasses(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            Validate annotation = clazz.getAnnotation(Validate.class);
            Class<?>[] classes = annotation.value();
            System.out.println("Классы для проверки в " + clazz.getSimpleName() + ":");
            for (Class<?> c : classes) {
                System.out.println("- " + c.getSimpleName());
            }
        } else {
            System.out.println("Аннотация @Validate не найдена");
        }
    }
}