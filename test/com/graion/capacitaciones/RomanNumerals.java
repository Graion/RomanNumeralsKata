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
	
	@Test
	public void testRomanBasicAdditionToArabic() {
		assertEquals(new RomanNumeral("II").toArabic(), 2);
		assertEquals(new RomanNumeral("XXX").toArabic(), 30);
		assertEquals(new RomanNumeral("CC").toArabic(), 200);
		assertEquals(new RomanNumeral("MMM").toArabic(), 3000);
		assertEquals(new RomanNumeral("MCXI").toArabic(), 1111);
		assertEquals(new RomanNumeral("MDCLXVI").toArabic(), 1666);
	}
	
	@Test
	public void testRomanBasicSubstractionToArabic() {
		assertEquals(new RomanNumeral("IV").toArabic(), 4);
		assertEquals(new RomanNumeral("IX").toArabic(), 9);
		assertEquals(new RomanNumeral("XL").toArabic(), 40);
		assertEquals(new RomanNumeral("XC").toArabic(), 90);
		assertEquals(new RomanNumeral("CD").toArabic(), 400);
		assertEquals(new RomanNumeral("CM").toArabic(), 900);
		assertEquals(new RomanNumeral("XIV").toArabic(), 14);
		assertEquals(new RomanNumeral("LIX").toArabic(), 59);
		assertEquals(new RomanNumeral("CXL").toArabic(), 140);
		assertEquals(new RomanNumeral("DXC").toArabic(), 590);
		assertEquals(new RomanNumeral("MCD").toArabic(), 1400);
		assertEquals(new RomanNumeral("MCM").toArabic(), 1900);
	}
	
	@Test
	public void testRomanComplexSubstractionToArabic() {
		assertEquals(new RomanNumeral("DXCIX").toArabic(), 599);
		assertEquals(new RomanNumeral("MCDXIV").toArabic(), 1414);
		assertEquals(new RomanNumeral("MCMLIX").toArabic(), 1959);
	}

}
