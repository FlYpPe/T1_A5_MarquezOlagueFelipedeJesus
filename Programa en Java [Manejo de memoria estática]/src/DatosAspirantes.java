class Aspirante {

	private String nombre;
	private String PrimerApeido;
	private String SegundoApellido;
	private String edad;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	private String redesSociales;
	private String carreraDeInteres;
	private String escuelaPrecedencia;
	private String bachilleratoCursado;
	private String folio;

	public Aspirante(String nombre, String primerApeido, String segundoApellido, String edad, String direccion,
			String telefono, String correoElectronico, String redesSociales, String carreraDeInteres,
			String escuelaPrecedencia, String bachilleratoCursado, String folio) {
		super();
		this.nombre = nombre;
		PrimerApeido = primerApeido;
		SegundoApellido = segundoApellido;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.redesSociales = redesSociales;
		this.carreraDeInteres = carreraDeInteres;
		this.escuelaPrecedencia = escuelaPrecedencia;
		this.bachilleratoCursado = bachilleratoCursado;
		this.folio = folio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApeido() {
		return PrimerApeido;
	}

	public void setPrimerApeido(String primerApeido) {
		PrimerApeido = primerApeido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public String getCarreraDeInteres() {
		return carreraDeInteres;
	}

	public void setCarreraDeInteres(String carreraDeInteres) {
		this.carreraDeInteres = carreraDeInteres;
	}

	public String getEscuelaPrecedencia() {
		return escuelaPrecedencia;
	}

	public void setEscuelaPrecedencia(String escuelaPrecedencia) {
		this.escuelaPrecedencia = escuelaPrecedencia;
	}

	public String getBachilleratoCursado() {
		return bachilleratoCursado;
	}

	public void setBachilleratoCursado(String bachilleratoCursado) {
		this.bachilleratoCursado = bachilleratoCursado;

	}
	
	public String getFolio() {
		return folio;
	}


	public void setFolio(String folio) {
		this.folio = folio;
	}


	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", PrimerApeido=" + PrimerApeido + ", SegundoApellido=" + SegundoApellido
				+ ", edad=" + edad + ", direccion=" + direccion + ", telefono=" + telefono + ", correoElectronico="
				+ correoElectronico + ", redesSociales=" + redesSociales + ", carreraDeInteres=" + carreraDeInteres
				+ ", escuelaPrecedencia=" + escuelaPrecedencia + ", bachilleratoCursado=" + bachilleratoCursado
				+ ", folio=" + folio + "]";
	}


	
}

class RegistroAspirantes{
	
	Aspirante[] vectorAspirantes = new Aspirante[10];
	
	
	public boolean registrarAspirantes(Aspirante as) {
		for (int i = 0; i < vectorAspirantes.length; i++) {
			if (vectorAspirantes[i]==null) {
				vectorAspirantes[i] = as;
				break;
			}
		}
		return false;
	}
	
	public boolean eliminarAspirante(int posicion) {
		
		for (int i = 0; i < vectorAspirantes.length; i++) {
			if (i==posicion)
				vectorAspirantes[i]=null;
			
		}
		
		return false;
	}

	public void imprimirAspirantes() {
		for (int i = 0; i < vectorAspirantes.length; i++) {
			System.out.println(vectorAspirantes[i]);
		}
	}
	
}




public class DatosAspirantes {

	public static void main(String[] args) {
		
		Aspirante a1 = new Aspirante("Juan", "Peñaloza", "Landeros", "20", "Villanueva", "n/a", "ascada@gmail.com", "Juan loza", "Sistemas", "Francisco", "Física", "123123");
		Aspirante a2 = new Aspirante("Juan", "Peñaloza", "Landeros", "20", "Villanueva", "n/a", "ascada@gmail.com", "Juan loza", "Sistemas", "Francisco", "Física", "123123");
		Aspirante a3 = new Aspirante("Juan", "Peñaloza", "Landeros", "20", "Villanueva", "n/a", "ascada@gmail.com", "Juan loza", "Sistemas", "Francisco", "Física", "123123");
		RegistroAspirantes r = new RegistroAspirantes();
		System.out.println(a1);
		r.registrarAspirantes(a1);
		r.registrarAspirantes(a2);
		r.registrarAspirantes(a3);
		
		r.eliminarAspirante(2);
		r.imprimirAspirantes();
	}

}