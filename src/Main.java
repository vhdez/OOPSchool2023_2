public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Andrew Sears";

        Teacher teacher1 = new Teacher("Mr. Latimer","Algebra 2",student1);
        teacher1.greetStudents();
        teacher1.giveLesson();

        Teacher teacher2 = new Teacher("Mr. Reddy", "Pre-Calculus",null);
        teacher2.greetStudents();
        teacher2.giveLesson();
    }
}