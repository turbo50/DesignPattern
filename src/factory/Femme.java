package factory;

public class Femme extends PersonneAbstraite {

	private int nombreAccouchement;
	
	

	public Femme(int id, String nom, int nombreAccouchement) {
		super(id, nom);
		this.nombreAccouchement = nombreAccouchement;
	}

	@Override
	public void sePresenter() {
		System.out.println("Bonjour je m'appelle " + getNom() + " je suis une femme ");
	}

	
	public String sePresenter2() {
		return "Bonjour je m'appelle " + getNom() + " je suis une femme ";
	}

}
