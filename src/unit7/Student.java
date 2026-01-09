package unit7;
import java.util.Arrays;

public class Student {

    private final String name;
    private int[] grades;
    private int gradeCount;

    public Student(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name.trim();
        this.grades = new int[10];
        this.gradeCount = 0;
    }

    public Student(String name, int... initialGrades) {
        this(name);

        if (initialGrades != null) {
            for (int grade : initialGrades) {
                addGrade(grade);
            }
        }
    }

    public void addGrade(int grade) {
        validateGrade(grade);
        if (gradeCount == grades.length) {
            grades = Arrays.copyOf(grades, grades.length * 2);
        }
        grades[gradeCount] = grade;
        gradeCount++;
    }

    public void addGrades(int... newGrades) {
        if (newGrades != null) {
            for (int grade : newGrades) {
                addGrade(grade);
            }
        }
    }

    private void validateGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5. Получено: " + grade);
        }
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, gradeCount);
    }

    public String toString() {
        if (gradeCount == 0) {
            return name + ": []";
        }

        StringBuilder sb = new StringBuilder(name + ": [");
        for (int i = 0; i < gradeCount; i++) {
            sb.append(grades[i]);
            if (i < gradeCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}

