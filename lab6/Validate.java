import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения программы
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE}) // Можно ставить на классы и другие аннотации
public @interface Validate {
    Class<?>[] value(); //  массив классов
}