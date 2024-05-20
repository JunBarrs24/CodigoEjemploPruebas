package org.example.repository;

import org.example.model.Course;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
    private final Map<String, Course> courses = new HashMap<>();

    public Course save(String courseName) {
        Course course = new Course(courseName);
        courses.put(courseName, course);
        return course;
    }

    public Course findByName(String courseName) {
        return courses.get(courseName);
    }
}
