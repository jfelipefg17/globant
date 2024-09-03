Algoritmo frase
	
	definir i, longfrase como entero
	definir frasee Como Caracter
	
	Escribir "ingrese una palabra"
	leer frasee
	
	longfrase = Longitud(frasee)
	
	para i = 0 hasta longfrase Hacer
		
		Escribir Sin Saltar " ", subcadena(frasee,i,i)
		
	FinPara
FinAlgoritmo
