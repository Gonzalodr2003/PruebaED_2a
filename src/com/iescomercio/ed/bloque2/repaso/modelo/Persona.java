package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * Clase que representa una persona en la que se puede meter a una persona 
 * introduciendo x parámetros, sacar e introducir su DNI, sacar e introducir su nombre, 
 * sacar e introducir su apellido, comparar y pararlo todo a String.
 * 
 * @author Carlos Sáenz Adán
 * @author Gonzalo Díaz Romeo
 * @version 1.0
 * @since 1.0
 *
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	/**
	 * Constructor de la clase Persona sin parámetros (Esta es la default)
	 */
	public Persona() {}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Constructor de la clase persona, en la que se introducen parámetros para darle forma a la clase 
	 * en ese momento.
	 * 
	 * @param dni DNI de la persona que queremos introducir
	 * @param nombre Nombre de la persona que queremos introducir
	 * @param apellido1 Primer apellido de la persona que queremos introducir
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que devuelve el DNI de la persona
	 * @return El DNI de la persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que te permite introducir el DNI de la persona.
	 * @param dni DNI de la persona que queremos introducir.
	 * @throws Exception Exception Si el último dígito del DNI no es una letra.
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que devuelve el nombre de la persona.
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que te permite introducir el nombre de la persona.
	 * @param nombre Nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que devuelve el apellido de la persona.
	 * @return El apellido de la persona.
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	/**
	 * Método que te permite introducir el apellido de la persona.
	 * @param apellido1 Primer apellido de la persona.
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
