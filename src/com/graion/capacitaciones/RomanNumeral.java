package com.graion.capacitaciones;

import java.util.Hashtable;

public class RomanNumeral {

	private String numeral;
	private Hashtable<String, Integer> romanArabicTable;

	public RomanNumeral(String numeral) {
		this.numeral = numeral;
		this.romanArabicTable = new Hashtable<String, Integer>();
		this.romanArabicTable.put("I", 1);
		this.romanArabicTable.put("IV", 4);
		this.romanArabicTable.put("V", 5);
		this.romanArabicTable.put("IX", 9);
		this.romanArabicTable.put("X", 10);
		this.romanArabicTable.put("XL", 40);
		this.romanArabicTable.put("L", 50);
		this.romanArabicTable.put("XC", 90);
		this.romanArabicTable.put("C", 100);
		this.romanArabicTable.put("CD", 400);
		this.romanArabicTable.put("D", 500);
		this.romanArabicTable.put("CM", 900);
		this.romanArabicTable.put("M", 1000);
	}

	public int toArabic() {
		if (this.numeral.isEmpty())
			return 0;
		else if (this.romanArabicTable.containsKey(this.numeral))
			return this.romanArabicTable.get(this.numeral);
		else {
			int headLength = 1;
			if (this.romanArabicTable.containsKey(this.numeral.substring(0, 2))) {
				headLength = 2;
			}
			String head = this.numeral.substring(0, headLength);
			String tail = this.numeral.substring(headLength, this.numeral.length());
			return new RomanNumeral(head).toArabic() + new RomanNumeral(tail).toArabic();
		}
	}
	
}
