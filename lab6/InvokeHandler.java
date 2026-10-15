import java.lang.reflect.Method;

public class InvokeHandler {

    public void autoInvoke(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getMethods();
        // Перебираем все методы класса
        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                method.invoke(obj);
            }
        }
    }
}