package org.example;

import org.example.di.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentController studentController = context.getBean(StudentController.class);

        // Add a course
        studentController.addStudent("John Doe", "Computer Science");

        // Get a student
        studentController.getStudent(1);

        // Assign a course to student
        studentController.assignCourseToStudent(1, "Mathematics");

        // Get course by student ID
        studentController.getCourseByStudentId(1);

        context.close();
    }
}
