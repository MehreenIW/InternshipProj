package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:application.properties")
public class StudentClient {

    @Value("${baseurl}")
    private String baseurl;

    @Autowired
    RestTemplate restTemplate;

//Using RestTemplate


    public List<Student> getAllStudents() {
        Student[] usersArray = restTemplate.getForObject(baseurl, Student[].class);
        return Arrays.asList(usersArray);
    }

    public Student getById(@PathVariable final long id) {
//        Map<String, String> params = new HashMap<>();
//            params.put("id", "100");
        return restTemplate.getForObject(baseurl+"/"+id,Student.class);
    }


    public void create(@RequestBody final Student newStudent) {
        restTemplate.postForObject(baseurl, newStudent, Student.class);
    }
}
