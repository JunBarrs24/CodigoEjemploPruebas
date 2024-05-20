package org.example.service;

import org.example.model.Course;
import org.example.model.Student;
import org.example.repository.CourseRepository;
import org.example.repository.StudentCourseRepository;
import org.example.repository.StudentRepository;

public class StudentCourseService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final StudentCourseRepository studentCourseRepository;

    public StudentCourseService(StudentRepository studentRepository, CourseRepository courseRepository, StudentCourseRepository studentCourseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.studentCourseRepository = studentCourseRepository;
    }

    public void assignCourseToStudent(int studentId, String courseName) {
        Student student = studentRepository.findById(studentId);
        Course course = courseRepository.findByName(courseName);
        if (student != null && course != null) {
            studentCourseRepository.assignCourseToStudent(student, course);
        }
    }

    public Course getCourseByStudentId(int studentId) {
        return studentCourseRepository.findCourseByStudentId(studentId);
    }
}
