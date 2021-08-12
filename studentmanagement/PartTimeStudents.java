package InternProject.studentmanagement;

public class PartTimeStudents extends Student {
    private int level;
    private boolean workStatus;

    public PartTimeStudents(int id, String firstname, String lastname, String courses, int level, boolean workStatus) {
        super(id, firstname, lastname, courses);
        this.level = level;
        this.workStatus = workStatus;
    }

    public void printDetails() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.courses);
        System.out.println(this.level);
        System.out.println(this.workStatus);

    }
}
