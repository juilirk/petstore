package com.itvedant.petstore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

class Student{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

@RestController
public class DemoController {
    
    @RequestMapping("/name")
    public String getName() {
        return "Itvedant Institute";
    }
    
    
    @RequestMapping("/marks")
    public Double getMarks() {
        return 78.34;
    }


    @RequestMapping("/student")
    public Student getStudent(){
        Student s = new Student();
        s.setId(1);
        s.setName("Rahul");
        s.setAge(10);
        return s;
    }


    @RequestMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Neha");
        s1.setAge(9);
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Priya");
        s2.setAge(8);

        students.add(s1);
        students.add(s2);
        return students;
    }
        
}
