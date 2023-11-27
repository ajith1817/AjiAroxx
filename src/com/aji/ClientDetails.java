package com.aji;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ClientDetails {
public static void main(String[] args) {
	

	
	int age = 12;

	if (age > 18) {
		System.out.println("eligible");
	} else {
		System.out.println("not eligible");
	}
		
		

        Map <Integer,String> mp = new LinkedHashMap<>();
		
		mp.put( 1,"ajith");
		mp.put(2,"aroxx");
		System.out.println(mp);
		
	
		Set<Integer> mp2 = mp.keySet();
		
		System.out.println(mp2);

		String s = "23";
		
		System.out.println(s+6);
		int s1 = Integer.parseInt(s);
		System.out.println(s1+6);
			
	
	
	
	
}
	
	
	
	
}
