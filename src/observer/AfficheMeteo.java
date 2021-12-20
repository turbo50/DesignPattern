package observer;

public class AfficheMeteo implements IObserveur {

	@Override
	public void actualise(IObservable o) {
		o.display();
	}
}
