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
		return "\nBonjour, J'�tait mari�, mais Je suis divorc� depuis le " + dateDivorce + ". C'�tait triste ";
	}
	
	public void presenterMariage2() {
		System.out.println("Bonjour, J'�tait mari�, mais Je suis divorc� depuis le " + dateDivorce + ". C'�tait triste ");
	}
	
}
