package phase3;

import java.util.*;

public class phase3 {
	public static void main(String[] args) {
		char[] name = { 'E', 'L', 'E', 'N', 'A' };
		List<Character> listName = new ArrayList<>();
		Map mapLettersRepeated = new HashMap();

		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}

		Iterator<Character> it = listName.iterator();
		while (it.hasNext()) {
			String aux = it.next().toString();
			lletresRepetides(aux, mapLettersRepeated);
		}
		System.out.println(mapLettersRepeated);
	}

	public static void lletresRepetides(String letra, Map mapLletresRep) {
		boolean existKey = mapLletresRep.containsKey(letra); //
		Object value = (mapLletresRep.get(letra));

		if (existKey) {
			int valor = (Integer) value;
			valor++;
			mapLletresRep.put(letra, valor);

		} else {
			mapLletresRep.put(letra, 1);
		}
	}
}
