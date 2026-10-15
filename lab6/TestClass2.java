@Default(String.class) // тип String по умолчанию
public class TestClass2 {

    @Default(Integer.class)
    private String name;

    @Default(Boolean.class)
    private int age;

    @Default(Double.class)
    public String email;
}
