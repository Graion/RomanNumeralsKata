package com.graion.capacitaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRoman {

	@Test
	public void testOne() {
		ArabicToRomanConverter arabicToRoman = new ArabicToRomanConverter();
		assertEquals(arabicToRoman.convert(1), new RomanNumeral("I"));
	}
	
	@Test
	public void testBasicNumbers() {
		ArabicToRomanConverter arabicToRoman = new ArabicToRomanConverter();
		assertEquals(arabicToRoman.convert(1), new RomanNumeral("I"));
		assertEquals(arabicToRoman.convert(5), new RomanNumeral("V"));
		assertEquals(arabicToRoman.convert(10), new RomanNumeral("X"));
		assertEquals(arabicToRoman.convert(50), new RomanNumeral("L"));
		assertEquals(arabicToRoman.convert(100), new RomanNumeral("C"));
		assertEquals(arabicToRoman.convert(500), new RomanNumeral("D"));
		assertEquals(arabicToRoman.convert(1000), new RomanNumeral("M"));
	}

}
