package InternProject.StudentMangement;

public class fullTimeStudents extends GeneralStudent{
    String hostelName;
    int year;

    public fullTimeStudents(int id, String firstname, String lastname, String courses,String hostelName, int year) {
        super(id, firstname, lastname, courses);
        this.hostelName = hostelName;
        this.year = year;
    }

}
