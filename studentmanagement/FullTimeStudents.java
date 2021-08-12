package InternProject.studentmanagement;

public class FullTimeStudents extends Student {
    private String hostelName;
    private int year;

    public FullTimeStudents(int id, String firstname, String lastname, String courses, String hostelName, int year) {
        super(id, firstname, lastname, courses);
        this.hostelName = hostelName;
        this.year = year;
    }

}
