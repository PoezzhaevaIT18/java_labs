@ToString  // Аннотация на классе - используется значение по умолчанию YES для всех полей
public class TestClass3 {

    @ToString(Mode.YES)  // Явно указываем YES - поле будет в строке
    private String name = "Karina";

    @ToString(Mode.NO)  // Указываем NO - поле НЕ будет включено в строку
    private int age = 19;

    @ToString  // Используется значение по умолчанию YES - поле будет в строке
    private String email = "karina@mail.com";

    @ToString(Mode.NO)  // Указываем NO - поле НЕ будет включено в строку
    private double salary = 100000.0;

    public String getName() {
        return name; }

    public int getAge() {
        return age; }

    public String getEmail() {
        return email; }

    public double getSalary() {
        return salary; }
}