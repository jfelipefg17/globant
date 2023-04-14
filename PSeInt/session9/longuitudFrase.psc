Algoritmo longuitudFrase
	
	definir i, longfrase como entero
	definir frasee Como Caracter
	
	Escribir "ingrese una palabra"
	leer frasee
	
	longfrase = Longitud(frasee)
	
	para i = longfrase hasta 0 con paso -1 Hacer
		
		Escribir Sin Saltar " ", subcadena(frasee,i,i)
		
	FinPara
	
FinAlgoritmo
