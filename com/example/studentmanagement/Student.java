package InternProject.com.example.studentmanagement;

import java.util.Arrays;

public class Student {
    protected int studentId;
    protected String firstName;
    protected String lastName;
    protected String[] courses;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getCourses() {
        return courses;
    }

    public Student(int id, String firstname, String lastname, String[] courses) {
        {
            this.studentId = id;
            this.firstName = firstname;
            this.lastName = lastname;
            this.courses = courses;
        }


    }
}

