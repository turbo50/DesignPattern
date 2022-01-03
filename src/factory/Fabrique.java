package factory;

import java.util.List;

public class Fabrique implements IFabrique{

	@Override
	public <T extends PersonneAbstraite> T creer(Class<T> c) {
		PersonneAbstraite p =  switch(c.getCanonicalName()) {
			case "factory.Femme" : yield new Femme(1, "Adelle", 2);
			default : yield new Homme(3, "Bob", 12);
		};
		return (T) p;
	}

	

	
}
