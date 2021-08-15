package InternProject.com.example.studentmanagement.repository;

import InternProject.com.example.studentmanagement.Student;

public interface StudentRepository {
    public void addStudent(Student newStudent);
    public Student getStudent(int studentId);
    public void listStudent();
    public void deleteStudentId(int studentId);


}
