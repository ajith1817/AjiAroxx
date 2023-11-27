package org.sam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClientDetails{

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		
		e1.setIdno(2345);
		e1.setName("Ajith");
		e1.setMobile(246764534);

	
	Employee e2 = new Employee();
	
	
	e2.setIdno(654);
	e2.setName("Aroxx");
	e2.setMobile(784687624);
	
	
	Map<Integer, Employee> mp = new LinkedHashMap<>();
	
	mp.put(1, e1);
	
	mp.put(2, e2);
	
	Set<Entry<Integer, Employee>> m = mp.entrySet();
	
	for (Entry<Integer, Employee> v : m) {
		System.out.println(v.getValue().getIdno());
	System.out.println(v.getValue().getName());
	
	System.out.println(v.getValue().getMobile());
	}
	
	
	
	
	
	
	
	
	}	
		
}


