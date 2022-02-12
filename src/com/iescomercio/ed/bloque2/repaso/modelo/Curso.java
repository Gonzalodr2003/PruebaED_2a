package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase que representa un curso en la que se puede eliminar un alumno, aniadirlo, comprobar si 
 * esta registrado, comprobar el n�mero de alumnos que hay y mostrarlos a todos.
 * 
 * @author Carlos S�enz Adan
 * @author Gonzalo D�az Romeo
 * @version 1.0
 * @since 1.0
 *
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * M�todo que tiene la funci�n de eliminar un alumno, indic�ndole el alumno por par�metros.
	 * 
	 * @param dni DNI de la persona que se quiere eliminar.
	 * @throws Exception Si el DNI tiene una capacidad inferior a 9 digitos sacar� la frase "El dni no tiene la longitud adecuada".
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * M�todo que tiene la funci�n de aniadir un alumno, indic�ndole el alumno por par�metros.
	 * 
	 * @param p Lista que compone los datos de la persona que se quiere aniadir al curso.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * M�todo que tiene la funci�n de comprobar si el cliente que se indica 
	 * por par�metros est� ya registrado en la base de datos del curso.
	 * 
	 * @param dni DNI de la persona quien se quiere comprobar su existencia en dicho grupo.
	 * @return Verdadero si el DNI se encuentra en la base de datos del curso y Falso en caso contrario
	 * 
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Es el constructor de la clase Curso.
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Devuelve el n�mero de alumnos que hay en el curso
	 * @return N�mero de alumnos que hay en el curso
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	/**
	 * Muestra todos los alumnos que hay en dicho curso.
	 */
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
