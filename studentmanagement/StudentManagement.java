package InternProject.studentmanagement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;


public class StudentManagement {

    final static HashMap<Integer, String> studentMap = new HashMap<>();
//    static Scanner keyboard = new Scanner(System.in);

    public static void printMenu(){
        
        System.out.println("Choose the option :");
        System.out.println("0 - Exit ");
        System.out.println("1 - Add New Student");
        System.out.println("2 - List Students :");
        System.out.println("3 - View Student Details :");
        System.out.println("4 - Delete Student:");
    }

    public static Scanner getScanner(){
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard;
    }
    public static void exitMenu(){
        
        System.exit(0);
    }

    public static void addNewStudent(Scanner keyboard ){

        System.out.println("Enter the details of the student");

        System.out.println("New Student ID : ");
        int newId = keyboard.nextInt();
        keyboard.nextLine();

       System.out.println("First Name : ");
       String firstname = keyboard.nextLine();

        System.out.println("Last Name : ");
        String lastname = keyboard.nextLine();

        System.out.println("Course: ");
        String[] courses = new String[4];
            for(int j = 0; j < courses.length;j++)
            {
                courses[j] = keyboard.nextLine();
            }

        System.out.println("Enter 1 for Full-time and 2 for Part-time : ");
        int type = keyboard.nextInt();
        keyboard.nextLine();

        if (type == 1) {
            System.out.println("Hostel Name : ");
            String hostelName = keyboard.nextLine();

            System.out.println("Year : ");
            int year = keyboard.nextInt();

            Student newStudent = new FullTimeStudents(newId, firstname, lastname, courses, hostelName, year);
            studentMap.put(newId, "First Name: "+ firstname + " " +"Last Name: "+ lastname + " " + "Course: "+ Arrays.toString(courses) + " " +"Hostel Name: "+ hostelName + " " +"Year: "+ year);

        } else {
            
            System.out.println("Level : ");
            int level = keyboard.nextInt();

            System.out.println("Working (True/False): ");
            boolean working = keyboard.nextBoolean();

            Student newStudent = new PartTimeStudents(newId, firstname, lastname, courses, level, working);
            studentMap.put(newId, "First Name: "+ firstname + " " +"Last Name: "+  lastname + " " + "Course: "+ Arrays.toString(courses) + " " + "Level: "+ level + " " +"Work Status: "+  working);

        }
        System.out.println("Record added successfully");
    }

    public static  void listStudents(){
        
        System.out.println("List of Students :");
        System.out.println(studentMap);
    }

    public static  void getStudent(Scanner keyboard){
        
       System.out.println("Enter the id of the student to get details : ");
        int findId = keyboard.nextInt();
        System.out.println(studentMap.get(findId));
    }
    public static  void delStudent(Scanner keyboard){
        
        System.out.println("Enter the id of the student : ");
        int delId = keyboard.nextInt();
        System.out.println(studentMap.remove(delId));
        System.out.println("Record deleted successfully");
    }


    public static void main(String[] args) {

        boolean cond = true;
        do {
            
            printMenu();
            Scanner keyboard = getScanner();
            int userInput = keyboard.nextInt();
            switch (userInput) {
                case 0 -> exitMenu();
                case 1 -> addNewStudent(keyboard);
                case 2 -> listStudents();
                case 3 -> getStudent(keyboard);
                case 4 -> delStudent(keyboard);
                }
        } while (cond);

    }
}


