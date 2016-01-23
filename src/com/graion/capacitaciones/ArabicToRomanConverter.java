package com.graion.capacitaciones;

public class ArabicToRomanConverter {

	private ArabicToRomanTable arabicToRomanTable = new ArabicToRomanTable();

	public RomanNumeral convert(int number) {
		return new RomanNumeral(this.arabicToRomanTable.get(number));
	}

}
