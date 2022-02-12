package com.iescomercio.ed.bloque2.repaso.modelo.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.iescomercio.ed.bloque2.repaso.modelo.Persona;

class PersonaTest {

	@Test
	void testPersona(){
		Persona persona1 = new Persona("16578459F","Gonzalo", "Diaz");
		Persona persona2 = new Persona();
		try {
			persona2.setDni("16578459F");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		persona2.setNombre("Gonzalo");
		persona2.setApellido1("Diaz");
		assertEquals(persona1, persona2);
	}

	@Test
	void testGetDni() {
		Persona persona1 = new Persona("16578459F","Gonzalo", "Diaz");
		assertEquals("16578459F", persona1.getDni());
	}
	
	@Test
	void testSetDni() {
		Persona persona1 = new Persona();
		try {
			persona1.setDni("16578459F");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String esperado = "16578459F";
		assertEquals(esperado, persona1.getDni());
	}
	
	@Test
	void testGetNombre() {
		Persona persona1 = new Persona("16578459F","Gonzalo", "Diaz");
		assertEquals("Gonzalo", persona1.getNombre());
	}

	@Test
	void testSetNombre() {
		Persona persona1 = new Persona();
		persona1.setNombre("Gonzalo");
		String esperado = "Gonzalo";
		assertEquals(esperado, persona1.getNombre());
	}

	@Test
	void testGetApellido1() {
		Persona persona1 = new Persona("16578459F","Gonzalo", "Diaz");
		assertEquals("Diaz", persona1.getApellido1());
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
