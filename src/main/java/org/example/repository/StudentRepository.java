package org.example.repository;

import org.example.model.Course;
import org.example.model.Student;
import java.util.HashMap;
import java.util.Map;

/**
 * It's supposed to be a DB (put it here as example
 */
public class StudentRepository {
    private final Map<Integer, Student> students = new HashMap<>();
    private int currentId = 1;

    public Student save(String name, String courseName) {
        Student student = new Student(currentId, name, new Course(courseName));
        students.put(currentId, student);
        currentId++;
        return student;
    }

    public Student findById(int id) {
        return students.get(id);
    }
}
