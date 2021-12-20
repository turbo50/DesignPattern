package factory;

public class Fabrique implements IFabrique{

	@Override
	public PersonneAbstraite creer(Class<?> c) {
		Object o = switch(c.getCanonicalName()) {
			case "factory.Femme" : yield new Femme(1, "Adelle", 2);
			default : yield new Homme(3, "Bob", 12);
		};
		return (PersonneAbstraite)o;
	}

		
}
