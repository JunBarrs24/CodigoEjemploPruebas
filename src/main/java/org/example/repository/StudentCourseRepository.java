package org.example.repository;

import org.example.model.Course;
import org.example.model.Student;
import java.util.HashMap;
import java.util.Map;

public class StudentCourseRepository {
    private final Map<Integer, Course> studentCourses = new HashMap<>();

    public void assignCourseToStudent(Student student, Course course) {
        studentCourses.put(student.getId(), course);
    }

    public Course findCourseByStudentId(int studentId) {
        return studentCourses.get(studentId);
    }
}
