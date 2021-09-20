package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StudentClient client;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Create a new user and get it back
        int id = ThreadLocalRandom.current().nextInt(1000);
        System.out.println(id);
        Student newUser = new Student(id, "Mahi", "Manz", new String[]{"Eng", "Sci", "Math", "Comp"});
        client.create(newUser);
        Student student = client.getById(id);
        System.out.println("A newly created user "+ student);


        List<Student> allUsers = client.getAllStudents();
        System.out.println("All the users : " +  allUsers);

        // Get a specific user
        Student specificUser = client.getById(100);
        System.out.println("A specific user "+ specificUser);


    }
}
