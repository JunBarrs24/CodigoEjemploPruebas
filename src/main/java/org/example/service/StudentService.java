package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(String name, String courseName) {
        return studentRepository.save(name, courseName);
    }

    public Student getStudent(int id) {
        return studentRepository.findById(id);
    }
}
