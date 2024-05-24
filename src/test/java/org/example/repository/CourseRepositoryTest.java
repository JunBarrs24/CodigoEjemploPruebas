package org.example.repository;

import org.example.model.Course;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CourseRepositoryTest {
    private CourseRepository repository;

    @Before
    public void setup() {
        repository = new CourseRepository();
    }



    @Test
    public void save_whenSave_saveSuccesfully() {
        // Prepare
        //CourseRepository repository = new CourseRepository();
        String valor = "UnValor";

        // Ejecucion
        Course resultado = repository.save(valor);

        // Validacion
        assertNotNull(resultado);
        assertEquals(valor,  resultado.getName());
    }

    @Test
    public void findByName_whenResultSave_resultIsReturned() {
        // Prepare

        repository.save("OtroCurso");

        Course resultado = repository.findByName("OtroCurso");

        assertEquals("OtroCurso", resultado.getName());

    }
}
