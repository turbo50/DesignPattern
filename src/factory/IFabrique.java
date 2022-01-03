package factory;

public interface IFabrique{
	public <T extends PersonneAbstraite> T creer (Class<T> c);
}
