package org.example.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.example.repository.CourseRepository;
import org.example.repository.StudentRepository;
import org.example.repository.StudentCourseRepository;
import org.example.service.CourseService;
import org.example.service.StudentService;
import org.example.service.StudentCourseService;
import org.example.controller.StudentController;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    @Bean
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean
    public StudentCourseRepository studentCourseRepository() {
        return new StudentCourseRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentService(studentRepository);
    }

    @Bean
    public CourseService courseService(CourseRepository courseRepository) {
        return new CourseService(courseRepository);
    }

    @Bean
    public StudentCourseService studentCourseService(StudentRepository studentRepository, CourseRepository courseRepository, StudentCourseRepository studentCourseRepository) {
        return new StudentCourseService(studentRepository, courseRepository, studentCourseRepository);
    }

    @Bean
    public StudentController studentController(StudentService studentService, StudentCourseService studentCourseService) {
        return new StudentController(studentService, studentCourseService);
    }
}
