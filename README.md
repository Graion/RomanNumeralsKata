# RomanNumeralsKata

Los romanos escribían sus números con símbolos alfabéticos, cada uno con una equivalencia en el sistema Arábigo que usamos en la actualidad:
- ‘I’ equivale a 1
- ‘V’ equivale a 5
- ‘X’ equivale a 10
- ‘L’ equivale a 50
- ‘C’ equivale a 100
- ‘D’ equivale a 500
- ‘M’ equivale a 1000

Además, los números romanos cuentan con ciertas reglas que deben cumplirse:
- Los símbolos 'I', 'X', 'C', y 'M' se puede repetir como máximo 3 veces seguidas.
- Los símbolos 'V', 'L' y 'D' no se pueden repetir.
- Los símbolos ‘uno’ ('I', 'X' y 'C') sólo pueden ser restados de los próximos 2 valores más altos (‘IV’ y ‘IX’, ‘XL’ y ‘XC’, ‘CD’ y 'CM').
- Sólo una resta se puede hacer por numeral (se permite 'XC', pero no 'XXC').
- Los símbolos ‘cinco’ ('V', 'L' y 'D') no se pueden restar.

Se pide implementar una solución que permita convertir números romanos hasta 'MMM' al sistema arábigo tradicional aplicando TDD.
