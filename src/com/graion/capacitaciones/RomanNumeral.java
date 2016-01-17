package com.graion.capacitaciones;

import java.util.Hashtable;

public class RomanNumeral {

	private String numeral;
	private Hashtable<String, Integer> romanArabicTable;

	public RomanNumeral(String numeral) {
		this.numeral = numeral;
		this.romanArabicTable = new Hashtable<String, Integer>();
		this.romanArabicTable.put("I", 1);
		this.romanArabicTable.put("V", 5);
		this.romanArabicTable.put("X", 10);
		this.romanArabicTable.put("L", 50);
		this.romanArabicTable.put("C", 100);
		this.romanArabicTable.put("D", 500);
		this.romanArabicTable.put("M", 1000);
	}

	public int toArabic() {
		Integer result = this.romanArabicTable.get(this.numeral);
		if (result == null) {
			String head = this.numeral.substring(0, 1);
			String tail = this.numeral.substring(1, this.numeral.length());
			return new RomanNumeral(head).toArabic() + new RomanNumeral(tail).toArabic();
		} else {
			return result;
		}
	}
	
}
