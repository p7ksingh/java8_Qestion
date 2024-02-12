package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;

    int id;

    String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student student4 = new Student("pankaj", 101, "Java", 60.5);
        Student student1 = new Student("pankaj", 101, "Java", 60.5);
        Student student2 = new Student("pankaj", 101, "Java", 60.5);
        Student student3 = new Student("pankaj", 101, "Java", 60.5);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
        System.out.println(studentspartionedByPercentage);

    }
}
