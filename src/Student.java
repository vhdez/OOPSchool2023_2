public class Student {
    private String name;
    private int grade;
    private boolean learnedEnough;
    private Assignment assignment;

    public Student(String name, int grade, boolean learnedEnough, Assignment assignment) {
        this.name = name;
        this.grade = grade;
        this.learnedEnough = learnedEnough;
        this.assignment = assignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isLearnedEnough() {
        return learnedEnough;
    }

    public void setLearnedEnough(boolean learnedEnough) {
        this.learnedEnough = learnedEnough;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }


    void learn() {
        System.out.println(getName() + " is learning about " + getAssignment().lessonNumber);
    }


    void complain() {

    }

    void doHw() {

    }

    public String toString() {
        return "Student named " + name;
    }
}
