package modelos;

public class Empleo {
	
	private int salario;
	private String nombreEmpleo;
	private String puesto;
	private String direccion;
	private int telefono;
	
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getNombreEmpleo() {
		return nombreEmpleo;
	}
	public void setNombreEmpleo(String nombreEmpleo) {
		this.nombreEmpleo = nombreEmpleo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Empleo [salario=" + salario + ", nombreEmpleo=" + nombreEmpleo + ", puesto=" + puesto + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	}


