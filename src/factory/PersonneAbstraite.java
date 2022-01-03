package factory;

public abstract class PersonneAbstraite {
	private int id;
	private String nom;
	
	
	
	public PersonneAbstraite(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public abstract  void sePresenter();



	@Override
	public String toString() {
		return "PersonneAbstraite [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
