package factory;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactory {
	private Fabrique fab;
	private Femme f;
	private Homme h;
	
	@BeforeEach
	public void setUp() {
		fab = new Fabrique();
		h = (Homme) fab.creer(Homme.class);
		f = (Femme) fab.creer(Femme.class);
	}
	
	@Test
	public void test_fabriqueOk1() {
		assertTrue(h instanceof Homme);
		assertNotSame(h, f);
	}
	
	@Test
	public void test_fabriqueOk2() {
		assertTrue(f instanceof Femme);
	}
	
	
}
