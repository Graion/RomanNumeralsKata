package com.graion.capacitaciones;

public class RomanNumeral {

	private String numeral;
	private RomanToArabicTable romanArabicTable;

	public RomanNumeral(String numeral) {
		this.romanArabicTable = new RomanToArabicTable();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeral == null) ? 0 : numeral.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RomanNumeral other = (RomanNumeral) obj;
		if (numeral == null) {
			if (other.numeral != null)
				return false;
		} else if (!numeral.equals(other.numeral))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RomanNumeral [numeral=" + numeral + "]";
	}
	
}
