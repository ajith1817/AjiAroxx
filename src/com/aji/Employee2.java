package com.aji;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Employee2 {

	

public static void main(String[] args) {
	

	String s1 = "www.string";
	if (s1.contains("ww")) {
		String s2 = s1.replace("ww", "ss");
	System.out.println(s2);
	}
}
}