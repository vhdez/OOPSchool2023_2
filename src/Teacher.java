import java.util.ArrayList;

class Teacher {
    // Fields
    private String name;
    private String subject;
    final private ArrayList<Student> students;
    private int creditCard;

    public Teacher(String name, String subject, int creditCard) {
        this.name = name;
        this.subject = subject;
        this.students = new ArrayList<Student>();
        this.creditCard = creditCard;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public Student getStudentNumber(int number) {
        return this.students.get(number);
    }

    public void forgetStudent(Student oldStudent) {
        this.students.remove(oldStudent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void greetStudents() {
        System.out.println("Hi " + students + " , it's your teacher " + getName());
        // ADVANCED
        //students.forEach((student) -> System.out.print(" Hi " + student.getName()));
        //System.out.println(" It's your teacher " + getName());
    }

    void giveLesson() {
        if (students.isEmpty()) {
            System.out.println("Where are my students?");
        } else {
            System.out.print("Alright ");
            students.forEach((student) -> System.out.print(student.getName() + " "));
            System.out.println(", let's talk about...");
        }
    }

    void assignHW() {
        System.out.println("Tonight I need you to...");
    }

    void buyALesson() {
        System.out.println("Buy a lesson using credit card #" + creditCard);
    }

    public String toString() {
        return "Teacher named " + name;
    }
}
