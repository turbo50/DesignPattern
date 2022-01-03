package factory;

public class Homme extends PersonneAbstraite {

	private int longueurBarbe;
	
	
	public Homme(int id, String nom, int longueurBarbe) {
		super(id, nom);
		this.longueurBarbe = longueurBarbe;
	}


	
	public String sePresenter2() {
		return "Bonjour je m'appelle " + getNom() + " je suis un homme ";
	}
	@Override
	public void sePresenter() {
		System.out.println("Bonjour je m'appelle " + getNom() + " je suis un homme ");
	}

}
