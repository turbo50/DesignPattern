package observer;

public class TestMain {

	public static void main(String[] args) {
		AfficheMeteo af = new AfficheMeteo();
		Meteo m = new Meteo();
		m.setDonneeMeteorologique((short) 12, " Paris 75019 ");
		m.add(af);
		m.setDonneeMeteorologique((short) 15, " Paris 75019 ");
	}

}
