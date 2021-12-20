package observer;

import java.util.ArrayList;
import java.util.Collection;

public class Meteo implements IObservable{

	private short temp;
	private String message;
	private Collection<IObserveur> lesObservateurs;

	public Meteo() {
		super();
		this.temp = 0;
		this.message = "Aucune données";
		this.lesObservateurs = new ArrayList<IObserveur>();
	}

	@Override
	public void add(IObserveur o) {
		lesObservateurs.add(o);		
	}

	@Override
	public void delete(IObserveur o) {
		lesObservateurs.remove(o);		
	}

	@Override
	public void notifieAll(Collection<IObserveur> col) {
		lesObservateurs.forEach(o -> o.actualise(this));		
	}
	
	@Override
	public void display() {
		System.out.println("Temp = " + temp + " -- " + message);
	}
	

	public void setDonneeMeteorologique(short temp, String message) {
		this.temp = temp;
		this.message = message;
		notifieAll(lesObservateurs);
	}

	
}
