package org.example.service;

import org.example.model.Course;
import org.example.repository.CourseRepository;

public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(String courseName) {
        return courseRepository.save(courseName);
    }

    public Course getCourse(String courseName) {
        return courseRepository.findByName(courseName);
    }
}
