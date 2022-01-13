package heritage;

import java.util.Collection;
import java.util.List;

import factory.Homme;


public class Test1 {		
	public static <T> void  presentation(List<T> liste){
		for(T t: liste) {
			if(t instanceof Mari m) {
				m.presenterMariage2();
			}else if(t instanceof Divorce d) {
				d.presenterMariage2();
			}
		}
	}
	
	public static <T extends Homme> void  presentation2(Collection<T> liste){
		for(T t: liste) {
			t.sePresenter();
		}
	}
	
	public static <T> void  presentation3(Collection<T> liste){
		for(T t: liste) {
		}
	}
}
