Algoritmo numbers
	Definir num, promedio, i Como Real
	promedio = 0
	i = 0
	
	Escribir "escriba un numero"
	leer num
	
	Mientras num <> -1 Hacer
		i = i + 1
		promedio = promedio + num
		Escribir "escriba un numero"
		leer num
		
	FinMientras
	
	Escribir "el promedio de los numeros que ingresaste seria ", promedio/i
	
FinAlgoritmo
