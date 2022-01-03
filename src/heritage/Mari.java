package heritage;

import java.time.LocalDate;

import factory.Homme;

public class Mari extends Homme {
	private LocalDate dateMariage;

	public Mari(int id, String nom, int longueurBarbe, LocalDate dateMariage) {
		super(id, nom, longueurBarbe);
		this.dateMariage = dateMariage;
	}
	
	public String presenterMariage() {
		return "\nBonjour, Je me suis mari� le " + dateMariage + ". C'�tait g�nial ";
	}
	public void presenterMariage2() {
		System.out.println("\nBonjour, Je me suis mari� le " + dateMariage + ". C'�tait g�nial ");
	}
	
	
}
