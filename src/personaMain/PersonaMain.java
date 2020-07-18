package personaMain;

import java.util.ArrayList;

import modelos.Empleo;
import modelos.Mascota;
import modelos.Personas;

public class PersonaMain {

	public static void main(String[] args) {

		ArrayList<Personas> listaPersonas = new ArrayList<Personas>();

		Personas ursula = new Personas();
		Empleo abogado = new Empleo();
		Mascota leon = new Mascota();

		ArrayList<Empleo> secretaria = new ArrayList<Empleo>();
		Empleo softtek = new Empleo();
		softtek.setSalario(10000);
		softtek.setNombreEmpleo("Ursula");
		softtek.setPuesto("Secretaria");
		softtek.setDireccion("Reformas 10025");
		softtek.setTelefono(55-12-00-32-60);
		secretaria.add(softtek);

		ursula.setNombre("Ursula");
		ursula.setEdad(35);
		ursula.setEmpleoActual(abogado);
		ursula.setEmpleoAnteriores(secretaria);
		ursula.setMascota(leon);

		abogado.setSalario(30000);
		abogado.setNombreEmpleo("Abogado");
		abogado.setPuesto("Gerente");
		abogado.setDireccion("Insurgente sur 1006");
		abogado.setTelefono(0230);

		leon.setComida("Roedores");
		leon.setNombre("Yuyi");
		leon.setRaza("Melena");

		Personas osiris = new Personas();
		Empleo licenciada = new Empleo();
		Mascota burro = new Mascota();
		ArrayList<Empleo> abogada = new ArrayList<Empleo>();
		Empleo conagua = new Empleo();
		abogada.add(conagua);

		conagua.setSalario(26000);
		conagua.setNombreEmpleo("Osiris");
		conagua.setPuesto("Abogada");
		conagua.setDireccion("Lomas de Chapultepec 302");
		conagua.setTelefono(55 - 66 - 52 - 23 - 60);
		secretaria.add(conagua);

		osiris.setEmpleoAnteriores(abogada);
		osiris.setNombre("Osiris");
		osiris.setEdad(35);
		osiris.setEmpleoActual(licenciada);
		osiris.setMascota(burro);

		licenciada.setSalario(32000);
		licenciada.setNombreEmpleo("licenciada");
		licenciada.setPuesto("Jefa");
		licenciada.setDireccion("Insurgente sur 1006");
		licenciada.setTelefono(0230);

		burro.setComida("Paja");
		burro.setNombre("Tutitu");
		burro.setRaza("Catalán");

		listaPersonas.add(ursula);
		listaPersonas.add(osiris);

		// Recorrer Lista de Persona
		for (Personas persona : listaPersonas) {

			persona.getEmpleoActual().setSalario(persona.getEmpleoActual().getSalario() + 10000);
		}

		System.out.println(listaPersonas);

	}

}
