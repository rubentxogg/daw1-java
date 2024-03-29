package com.rgg.dto;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private Integer edad;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona p) {
		if(this.getEdad().equals(p.getEdad()) && this.getNombre().equals(p.getNombre())) {
			return 0;
		}
		else if(this.getEdad() > p.getEdad()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
