package com.iescomercio.ed.bloque2.repaso.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.iescomercio.ed.bloque2.repaso.modelo.Curso;
import com.iescomercio.ed.bloque2.repaso.modelo.Persona;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		Integer cantSinEliminar; 
		Integer cantEliminando;
		Persona persona1 = new Persona ("15784512F", "Gonzalo", "Diaz");
		Persona persona2 = new Persona ("15785512F", "Raul", "Romeo");
		Persona persona3 = new Persona ("18785512F", "Pepe", "Rodriguez");
		Curso curso1 = new Curso();
		curso1.aniadirAlumno(persona1);
		curso1.aniadirAlumno(persona2);
		curso1.aniadirAlumno(persona3);
		cantSinEliminar=curso1.numeroAlumnos();
		try {
			curso1.eliminarAlumno(persona1.getDni());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cantEliminando=curso1.numeroAlumnos();
		assertEquals(cantSinEliminar-1, cantEliminando);
	}

	@Test
	void testAniadirAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
