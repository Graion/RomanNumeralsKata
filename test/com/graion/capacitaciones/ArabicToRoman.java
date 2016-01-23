package com.graion.capacitaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRoman {
	ArabicToRomanConverter arabicToRoman = new ArabicToRomanConverter();

	@Test
	public void testOne() {
		assertEquals(arabicToRoman.convert(1), new RomanNumeral("I"));
	}
	
	@Test
	public void testBasicNumbers() {
		assertEquals(arabicToRoman.convert(5), new RomanNumeral("V"));
		assertEquals(arabicToRoman.convert(10), new RomanNumeral("X"));
		assertEquals(arabicToRoman.convert(50), new RomanNumeral("L"));
		assertEquals(arabicToRoman.convert(100), new RomanNumeral("C"));
		assertEquals(arabicToRoman.convert(500), new RomanNumeral("D"));
		assertEquals(arabicToRoman.convert(1000), new RomanNumeral("M"));
	}
	
	@Test
	public void testBasicAddition() {
		assertEquals(arabicToRoman.convert(2), new RomanNumeral("II"));
		assertEquals(arabicToRoman.convert(30), new RomanNumeral("XXX"));
		assertEquals(arabicToRoman.convert(200), new RomanNumeral("CC"));
		assertEquals(arabicToRoman.convert(3000), new RomanNumeral("MMM"));
		assertEquals(arabicToRoman.convert(1111), new RomanNumeral("MCXI"));
		assertEquals(arabicToRoman.convert(1666), new RomanNumeral("MDCLXVI"));
	}
	
	@Test
	public void testRomanComplexSubstraction() {
		assertEquals(arabicToRoman.convert(599), new RomanNumeral("DXCIX"));
		assertEquals(arabicToRoman.convert(1414), new RomanNumeral("MCDXIV"));
		assertEquals(arabicToRoman.convert(1959), new RomanNumeral("MCMLIX"));
	}
	
	@Test
	public void testRomanBorderCases() {
		assertEquals(arabicToRoman.convert(0), new RomanNumeral(""));
		assertEquals(arabicToRoman.convert(2999), new RomanNumeral("MMCMXCIX"));
	}
	
	@Test(expected=ConversionLimitReachedException.class)
	public void testConversionLimitShouldThrowException() {
		arabicToRoman.convert(3001);
	}
}
