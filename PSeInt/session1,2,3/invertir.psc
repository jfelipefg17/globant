Algoritmo invertidos
	
	Definir num, inv, decena, unidad Como Entero
	leer num
	decena = trunc(num / 10)
	unidad = num % 10
	
	inv = unidad * 10 + decena
	
	Escribir inv
FinAlgoritmo
