package InternProject.studentmanagement;

import java.util.Scanner;
import java.util.HashMap;


public class StudentManagement {


    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        boolean cond = true;
        while (cond) {
            System.out.println("Choose the option :");
            System.out.println("0 - Exit ");
            System.out.println("1 - Add New Student");
            System.out.println("2 - List Students :");
            System.out.println("3 - View Student Details :");
            System.out.println("4 - Delete Student:");
            Scanner keyboard = new Scanner(System.in);
            int userInput;
            userInput = keyboard.nextInt();
            switch (userInput) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter the details of the student :");
                    System.out.println("New Student ID : ");
                    int newId = keyboard.nextInt();

                    System.out.println("First Name : ");
                    String firstname = keyboard.nextLine();

                    System.out.println("Last Name : ");
                    String lastname = keyboard.nextLine();

                    System.out.println("Course: ");
                    String courses = keyboard.nextLine();

                    System.out.println("Enter 1 for Full-time and 2 for Part-time : ");
                    int type = keyboard.nextInt();

                    if (type == 1) {
                        System.out.println("Hostel Name : ");
                        String hostelName = keyboard.nextLine();

                        System.out.println("Year : ");
                        int year = keyboard.nextInt();
                        Student newStudent = new FullTimeStudents(newId, firstname, lastname, courses, hostelName, year);
                        studentMap.put(newId, firstname + " " + lastname + " " + courses + " " + hostelName + " " + year);

                    } else {
                        System.out.println("Level : ");
                        int level = keyboard.nextInt();

                        System.out.println("Working (True/False): ");
                        boolean working = keyboard.nextBoolean();

                        Student newStudent = new PartTimeStudents(newId, firstname, lastname, courses, level, working);
                        studentMap.put(newId, firstname + " " + lastname + " " + courses + " " + level + " " + working);

                    }
                    System.out.println("Record added successfully");
                    break;

                case 2:
                    System.out.println("List of Students :");
                    System.out.println(studentMap);

                    break;

                case 3:
                    System.out.println("Enter the id of the student to get details : ");
                    int findId = keyboard.nextInt();
                    System.out.println(studentMap.get(findId));
                    break;

                case 4:
                    System.out.println("Enter the id of the student : ");
                    int delId = keyboard.nextInt();
                    System.out.println(studentMap.remove(delId));
                    System.out.println("Record deleted successfully");
                    break;

            }
        }

    }
}


