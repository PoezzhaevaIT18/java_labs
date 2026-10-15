import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Доступна во время исполнения
@Target({ElementType.TYPE, ElementType.FIELD})  // Цель: ТИП или ПОЛЕ
public @interface Default {
    Class<?> value();  // Обязательное свойство value типа Class
}