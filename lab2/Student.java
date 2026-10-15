public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }
    public void setGrade(int index, int grade) {
        if (index >= 0 && index < grades.length) {
            grades[index] = grade;
        }
    }

    @Override
    public String toString() {
        String result = name + ": [";
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
            if (i < grades.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

}