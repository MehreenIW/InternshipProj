package InternProject.com.example.studentmanagement.repository;

import InternProject.com.example.studentmanagement.Student;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository{

    final private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student newStudent) {
        studentMap.put(newStudent.getStudentId(), newStudent);
    }

    @Override
    public Student getStudent(int studentId) {
        return studentMap.get(studentId);
    }
    public void listStudent() {
       System.out.println(studentMap);
    }

    @Override
    public void deleteStudentId(int studentId) {
        System.out.println(studentMap.get(studentId));
    }

}
