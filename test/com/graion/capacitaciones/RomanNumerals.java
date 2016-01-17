package com.graion.capacitaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumerals {

	@Test
	public void testRomanOneToArabic() {
		RomanNumeral romanOne = new RomanNumeral("I");
		assertEquals(romanOne.toArabic(), 1);
	}
	
	@Test
	public void testRomanBasicNumeralsToArabic() {
		assertEquals(new RomanNumeral("I").toArabic(), 1);
		assertEquals(new RomanNumeral("V").toArabic(), 5);
		assertEquals(new RomanNumeral("X").toArabic(), 10);
		assertEquals(new RomanNumeral("L").toArabic(), 50);
		assertEquals(new RomanNumeral("C").toArabic(), 100);
		assertEquals(new RomanNumeral("D").toArabic(), 500);
		assertEquals(new RomanNumeral("M").toArabic(), 1000);
	}

}
