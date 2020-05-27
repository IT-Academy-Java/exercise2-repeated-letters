package phase4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class phase4 {
	public static void main(String[] args) {
		char[] name = { 'E', 'L', 'E', 'N', 'A' };
		List<Character> listName = new ArrayList<>();
		
		Map mapLettersRepeated = new HashMap();
		
		char[] surname = {'P', 'I', 'A', 'G', 'G', 'I', 'O'};
		List<Character> listSurname = new ArrayList<>();

		List<Character> fullNameList = new ArrayList<>();
		
		for (int i = 0; i < name.length; i++) {
			listName.add(name[i]);
		}
		
		for (int i = 0; i < surname.length; i++) {
			listSurname.add(surname[i]);
		}

		Iterator<Character> it = listName.iterator();
		while (it.hasNext()) {
			String aux = it.next().toString();
			lletresRepetides(aux, mapLettersRepeated);
		}
		
		System.out.println(mapLettersRepeated);
		
		fullNameList.addAll(listName);
		fullNameList.add(' ');
		fullNameList.addAll(listSurname);
		
		System.out.println(fullNameList);
		
	}

	public static void lletresRepetides(String letra, Map<String, Integer> mapLletresRep) {
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

