package heritage;

import java.time.LocalDate;

import factory.Homme;

public class Divorce extends Homme {
	private LocalDate dateDivorce;

	public Divorce(int id, String nom, int longueurBarbe, LocalDate dateDivorce) {
		super(id, nom, longueurBarbe);
		this.dateDivorce = dateDivorce;
	}
	
	public String presenterMariage() {
		return "\nBonjour, J'était marié, mais Je suis divorcé depuis le " + dateDivorce + ". C'était triste ";
	}
	
	public void presenterMariage2() {
		System.out.println("Bonjour, J'était marié, mais Je suis divorcé depuis le " + dateDivorce + ". C'était triste ");
	}
	
}
