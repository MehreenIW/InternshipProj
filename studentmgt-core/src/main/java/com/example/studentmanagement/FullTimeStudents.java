package com.example.studentmanagement;

import java.util.Arrays;

public class FullTimeStudents extends Student {

    private String hostelName;
    private int year;

    @Override
    public String toString() {
        return "FullTimeStudent : {" +
                "  Student Id =" + studentId +
                ", First Name ='" + firstName + '\'' +
                ", Last Name ='" + lastName + '\'' +
                ", Hostel Name='" + hostelName + '\'' +
                ", Year =" + year +
                ", Student-type="+ Studenttype.Fulltime +
                ", Courses =" + Arrays.toString(courses) +
                '}';
    }

    public FullTimeStudents(int id, String firstName, String lastName, String[] courses,Studenttype studenttype, String hostelName, int year) {

        super(id, firstName, lastName, courses,studenttype);
        this.hostelName = hostelName;
        this.year = year;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
