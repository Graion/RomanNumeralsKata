package com.graion.capacitaciones;

import java.util.Hashtable;

@SuppressWarnings("serial")
public class RomanToArabicTable extends Hashtable<String, Integer> {
	public RomanToArabicTable() {
		this.put("I", 1);
		this.put("IV", 4);
		this.put("V", 5);
		this.put("IX", 9);
		this.put("X", 10);
		this.put("XL", 40);
		this.put("L", 50);
		this.put("XC", 90);
		this.put("C", 100);
		this.put("CD", 400);
		this.put("D", 500);
		this.put("CM", 900);
		this.put("M", 1000);
	}
}
