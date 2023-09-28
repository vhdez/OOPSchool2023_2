import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        Student student1 = new Student("Andrew Sears", 11, false, null);
        Student student2 = new Student("Eli Phillips", 12, false, null);
        Teacher teacher1 = new Teacher("Mr. Latimer","Algebra 2", 123456);
        teachers.add(teacher1);
        teachers.get(0).addStudent(student1);
        teachers.get(0).addStudent(student2);
        teachers.get(0).greetStudents();
        teachers.get(0).giveLesson();

        teachers.add(new Teacher("Mr. Reddy", "Pre-Calculus",0000));
        teachers.get(1).greetStudents();
        teachers.get(1).giveLesson();
    }
}