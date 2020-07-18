package modelos;

import java.util.ArrayList;

public class Personas {
	
	private String nombre;
	private int edad;
	private Empleo empleoActual;
	private ArrayList<Empleo> empleoAnteriores;
	private Mascota mascota;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Empleo getEmpleoActual() {
		return empleoActual;
	}
	public void setEmpleoActual(Empleo empleoActual) {
		this.empleoActual = empleoActual;
	}
	public ArrayList<Empleo> getEmpleoAnteriores() {
		return empleoAnteriores;
	}
	public void setEmpleoAnteriores(ArrayList<Empleo> empleoAnteriores) {
		this.empleoAnteriores = empleoAnteriores;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + ", empleoActual=" + empleoActual
				+ ", empleoAnteriores=" + empleoAnteriores + ", mascota=" + mascota + "]";
	}

}
	
	

