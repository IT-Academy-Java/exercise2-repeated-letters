package phase2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class phase2 {
	public static void main(String[] args) {
		char[] name = { 'E', 'L', 'E', 'N', 'A', '1' };

		List<Character> listName = new ArrayList<>();

		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}

		Iterator<Character> it = listName.iterator();

		while (it.hasNext()) {
			Object aux = it.next();
			if ("AEIOUaeiou".contains(aux.toString())) {
				System.out.println("Vocal");
			} else if ("0123456789".contains(aux.toString())) {
				System.out.println("Els noms de persones no contenen números!");
			} else {
				System.out.println("Consonante");
			}
		}
	}
}
