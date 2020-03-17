package beans;

public class Trabajador {
	
	private String cod;
	private String nom;
	private String ape;
	private int edad;
	private int gen_cod;
	private int dep_cod;
	
	public Trabajador(String cod, String nom, String ape, int edad, int gen_cod, int dep_cod) {
		super();
		this.cod = cod;
		this.nom = nom;
		this.ape = ape;
		this.edad = edad;
		this.gen_cod = gen_cod;
		this.dep_cod = dep_cod;
	}

	public Trabajador() {
		super();
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGen_cod() {
		return gen_cod;
	}

	public void setGen_cod(int gen_cod) {
		this.gen_cod = gen_cod;
	}

	public int getDep_cod() {
		return dep_cod;
	}

	public void setDep_cod(int dep_cod) {
		this.dep_cod = dep_cod;
	}
	
	
}
