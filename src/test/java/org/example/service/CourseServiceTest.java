package org.example.service;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.example.model.Course;
import org.example.repository.CourseRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCourse() {
        when(courseRepository.save("Biology")).thenReturn(new Course("Biology"));

        Course course = courseService.addCourse("Biology");

        assertNotNull(course);
        assertEquals("Biology", course.getName());
    }

    @Test
    public void testGetCourse() {
        Course course = new Course("Chemistry");
        when(courseRepository.findByName("Chemistry")).thenReturn(course);

        Course foundCourse = courseService.getCourse("Chemistry");

        assertNotNull(foundCourse);
        assertEquals("Chemistry", foundCourse.getName());
    }
}
