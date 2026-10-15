import java.lang.reflect.Field;

public class ToStringHandler {

    public String generateToString(Object obj) throws Exception {

        Class<?> clazz = obj.getClass();
        StringBuilder result = new StringBuilder();
        result.append(clazz.getSimpleName()).append("{");
        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;  // Флаг для определения первого поля
        // Перебираем все поля класса
        for (Field field : fields) {
            if (field.isAnnotationPresent(ToString.class)) {
                ToString annotation = field.getAnnotation(ToString.class);

                if (annotation.value() == Mode.YES) {
                    field.setAccessible(true);
                    Object value = field.get(obj);

                    if (!firstField) {
                        result.append(", ");
                    }
                    result.append(field.getName()).append("=").append(value);
                    firstField = false;
                }
            }
        }
        result.append("}");
        return result.toString();
    }
}