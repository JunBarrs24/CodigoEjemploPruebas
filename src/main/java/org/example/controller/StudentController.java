package org.example.controller;

import org.example.model.Student;
import org.example.model.Course;
import org.example.service.StudentService;
import org.example.service.StudentCourseService;

public class StudentController {
    private final StudentService studentService;
    private final StudentCourseService studentCourseService;

    public StudentController(StudentService studentService, StudentCourseService studentCourseService) {
        this.studentService = studentService;
        this.studentCourseService = studentCourseService;
    }

    public void addStudent(String name, String courseName) {
        Student student = studentService.addStudent(name, courseName);
        System.out.println("Student added: " + student.getName() + ", Course: " + student.getCourse().getName());
    }

    public void getStudent(int id) {
        Student student = studentService.getStudent(id);
        if (student != null) {
            System.out.println("Student found: " + student.getName() + ", Course: " + student.getCourse().getName());
        } else {
            System.out.println("Student not found");
        }
    }

    public void assignCourseToStudent(int studentId, String courseName) {
        studentCourseService.assignCourseToStudent(studentId, courseName);
        System.out.println("Assigned course " + courseName + " to student with ID " + studentId);
    }

    public void getCourseByStudentId(int studentId) {
        Course course = studentCourseService.getCourseByStudentId(studentId);
        if (course != null) {
            System.out.println("Course for student with ID " + studentId + ": " + course.getName());
        } else {
            System.out.println("Course not found for student with ID " + studentId);
        }
    }
}
