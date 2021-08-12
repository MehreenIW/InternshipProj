package InternProject.src.studentmanagement;

public class Student {
    protected int studentId;
    protected String firstName;
    protected String lastName;
    protected String courses;


    public Student(int id, String firstname, String lastname, String courses) {
        {
            this.studentId = id;
            this.firstName = firstname;
            this.lastName = lastname;
            this.courses = courses;
        }


    }
}

