package com.iescomercio.ed.bloque2.repaso.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

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
		Exception e = assertThrows(Exception.class, ()->curso1.eliminarAlumno("1589J"));
		assertEquals(e.getMessage(), "El dni no tiene la longitud adecuada");
	}

	@Test
	void testAniadirAlumno() {
		Integer cantSinAniadir; 
		Integer cantAniadiendo;
		Persona persona1 = new Persona ("15784512F", "Gonzalo", "Diaz");
		Curso curso1 = new Curso();
		cantSinAniadir=curso1.numeroAlumnos();
		curso1.aniadirAlumno(persona1);
		cantAniadiendo=curso1.numeroAlumnos();
		assertEquals(cantSinAniadir+1, cantAniadiendo);
	}

	@Test
	void testEstaRegistrado() {
		Persona persona1 = new Persona ("15784512F", "Gonzalo", "Diaz");
		Curso curso1 = new Curso();
		curso1.aniadirAlumno(persona1);
		assertTrue(curso1.estaRegistrado("15784512F"));
		assertFalse(curso1.estaRegistrado("16854726P"));
	}

	@Test
	void testCurso() {
		ArrayList<Persona> persona = new ArrayList<>();
		Persona persona1 = new Persona ("15784512F", "Gonzalo", "Diaz");
		Curso curso1 = new Curso();
		persona.add(persona1);
		curso1.aniadirAlumno(persona1);
		assertEquals(persona.size(), curso1.numeroAlumnos());
	}

	@Test
	void testNumeroAlumnos() {
		Persona persona1 = new Persona ("15784512F", "Gonzalo", "Diaz");
		Curso curso1=new Curso();
		curso1.aniadirAlumno(persona1);
		assertEquals(curso1.numeroAlumnos(), 1);
	}
}
