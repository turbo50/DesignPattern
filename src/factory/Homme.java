package factory;

public class Homme extends PersonneAbstraite {

	private int longueurBarbe;
	
	
	public Homme(int id, String nom, int longueurBarbe) {
		super(id, nom);
		this.longueurBarbe = longueurBarbe;
	}


	@Override
	public String sePresenter() {
		return "Bonjour je m'appelle " + getNom() + " je suis un homme ";
	}

}
