package com.graion.capacitaciones;

public class RomanNumeral {

	private String numeral;
	private RomanNumeralTable romanArabicTable;

	public RomanNumeral(String numeral) {
		this.romanArabicTable = new RomanNumeralTable();
		if (numeral.length() == 1 && !romanArabicTable.containsKey(numeral))
			throw new IllegalArgumentException(numeral);
		else
			this.numeral = numeral;
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
