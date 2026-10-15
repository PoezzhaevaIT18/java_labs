import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Аннотация доступна во время выполнения программы
@Target(ElementType.METHOD)           // Аннотацию можно ставить только над методами
public @interface Invoke {
    // не имеет свойств
}