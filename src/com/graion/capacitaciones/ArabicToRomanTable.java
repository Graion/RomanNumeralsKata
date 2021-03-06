package com.graion.capacitaciones;

import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class ArabicToRomanTable extends LinkedHashMap<Integer, String> {
	public ArabicToRomanTable() {
		this.put(1000, "M");
		this.put(900, "CM");
		this.put(500, "D");
		this.put(400, "CD");
		this.put(100, "C");
		this.put(90, "XC");
		this.put(50, "L");
		this.put(40, "XL");
		this.put(10, "X");
		this.put(9, "IX");
		this.put(5, "V");
		this.put(4, "IV");
		this.put(1, "I");
	}
}
