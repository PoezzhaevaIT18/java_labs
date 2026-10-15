public class CacheHandler {

    public void processClass(Class<?> clazz) {
        System.out.println("Обрабатываем класс: " + clazz.getSimpleName());
        if (clazz.isAnnotationPresent(Cache.class)) {
            Cache annotation = clazz.getAnnotation(Cache.class);
            String[] cacheAreas = annotation.value();
            if (cacheAreas.length == 0) {
                System.out.println("Список кешируемых областей ПУСТ");
            } else {
                System.out.println("Кешируемые области:");
                for (String area : cacheAreas) {
                    System.out.println("- " + area);
                }
                System.out.println("Всего областей: " + cacheAreas.length);
            }
        } else {
            System.out.println("Аннотация @Cache не найдена");
        }
        System.out.println();
    }
}