package unit7;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иван Петров");
        System.out.println("1. Студент без оценок: " + student1);

        student1.addGrade(4);
        student1.addGrade(5);
        student1.addGrade(3);
        System.out.println("2. После добавления оценок: " + student1);

        Student student2 = new Student("Мария Сидорова", 5, 4, 5, 3);
        System.out.println("3. Студент с начальными оценками: " + student2);

        student2.addGrades(4, 5, 2);
        System.out.println("4. После добавления нескольких оценок: " + student2);
    }
}
