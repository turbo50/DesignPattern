package observer;

import java.util.Collection;

public interface IObservable {
	public void add(IObserveur o);
	public void delete(IObserveur o);
	public void notifieAll(Collection<IObserveur> col);
	public void display();	
}
