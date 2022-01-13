package heritage;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factory.Homme;
import factory.PersonneAbstraite;

public class TestHeritage {

	public static void main(String[] args) {
		Homme h = new Homme(1, "Paul", 25);
		Mari m1 = new Mari(1, "Andre", 11, LocalDate.of(1987, Month.AUGUST, 11));
		Mari m2 = new Mari(2, "Pierre", 12, LocalDate.of(2020, Month.AUGUST, 12));
		Divorce d1 = new Divorce(2, "Albert", 12, LocalDate.of(1990, Month.DECEMBER, 11));
		Divorce d2 = new Divorce(4, "Hamid", 10, LocalDate.of(1990, Month.DECEMBER, 11));
		List<Homme> l_homme = List.of(h, m1, m2);
		List<? super Mari> l_mari_et_parent = List.of(h, m1, m2);
		List<Mari> l_mari = List.of(m1, m2);
		List<? extends PersonneAbstraite> l_all = List.of(h, m1, m2);
		/*
		System.out.println("Affichage de l_homme \n");
		l_homme.forEach(Homme::sePresenter2);
		
		System.out.println("Affichage de l_mari et classe parent\n");
		l_mari_et_parent.forEach(System.out::println);
		
		System.out.println("Affichage de l_mari\n");
		l_mari.forEach(Mari::presenterMariage2);
		
		System.out.println("Affichage de tous\n");
		l_all.forEach(p -> p.sePresenter());
		*/
		List<Divorce> liste = List.of(d1, d2);
		Map<String, String> m = new HashMap<String, String>(); m.put("k", "k");
		Test1.presentation3(m.values());
	}

};
