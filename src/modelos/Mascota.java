package modelos;

public class Mascota {
	
	private String comida;
	private String nombre;
	private String raza;
	
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "Mascota [comida=" + comida + ", nombre=" + nombre + ", raza=" + raza + "]";
	}
	
	}
	


