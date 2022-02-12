package com.iescomercio.ed.bloque2.repaso.modelo.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.iescomercio.ed.bloque2.repaso.modelo.Persona;

class PersonaTest {

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testPersona() {
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
	}

	@Test
	void testGetDni() {
		Persona persona1 = new Persona("16578459F","Gonzalo", "Diaz");
		assertArrayEquals("16578459F", persona1.getDni());
	}

	private void assertArrayEquals(String string, String dni) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
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
