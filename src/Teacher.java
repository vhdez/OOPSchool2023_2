class Teacher {
    // Fields
    private String name;
    private String subject;
    private Student student;

    public Teacher(String name, String subject, Student student) {
        this.name = name;
        this.subject = subject;
        this.student = student;
    }

    void greetStudents() {
        if (student != null) {
            System.out.println("Hi " + student + ", it's " + getName());
        } else {
            System.out.println("Hi students, it's " + getName());
        }
    }

    void giveLesson() {
        System.out.println("Alright everyone, let's talk about...");
    }

    void assignHW() {
        System.out.println("Tonight I need you to...");
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
