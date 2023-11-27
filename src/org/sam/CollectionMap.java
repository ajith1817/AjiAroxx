package org.sam;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {

		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();

		mp.put(11, "ajith");
		mp.put(22, "Manual");
		mp.put(33, "Selinium");
		mp.put(44, "Java");
		mp.put(55, "Aroxx");
		mp.put(44, "python");
		System.out.println(mp);

		String string = mp.get(22);
		System.out.println(string);

		String string2 = mp.get("python");
		System.out.println(string2);

		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);

		for (Integer c : keySet) {
			System.out.println(c);
		}
		Collection<String> values = mp.values();

		System.out.println(values);

		for (String c1 : values) {
			System.out.println(c1);
		}

		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> a : entrySet) {
			System.out.println(a);
			System.out.println(a.getKey());
			System.out.println(a.getValue());

		}

	}

}
