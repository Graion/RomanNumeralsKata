package com.graion.capacitaciones;

public class ArabicToRomanConverter {

	private ArabicToRomanTable arabicToRomanTable = new ArabicToRomanTable();

	public RomanNumeral convert(int number) {
		if (number > 3000) {
			throw new ConversionLimitReachedException();
		}
		StringBuilder roman = new StringBuilder();
		for (Integer arabic : arabicToRomanTable.keySet()) {
			while (number >= arabic) {
				roman.append(this.arabicToRomanTable.get(arabic));
				number = number - arabic;
			}
		}
		return new RomanNumeral(roman.toString());
	}

}
