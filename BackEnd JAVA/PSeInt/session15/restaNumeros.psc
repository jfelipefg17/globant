Algoritmo Encuentro_15_16_3
	Definir dividendo, divisor Como Entero
	
	Escribir "Ingrese el numero a dividir"
	Leer dividendo
	
	Escribir "Ingrese el numero divisor"
	Leer divisor
	
	division(dividendo,divisor)
FinAlgoritmo

SubProceso division(dividen,divis)
	Definir i, aux Como Entero
	
	i = 0
	Mientras dividen >= divis
		dividen = dividen - divis
		i = i + 1 
		aux = dividen
	FinMientras
	
	Escribir "El cociente es " i
	Escribir "El resto es " aux

FinSubProceso
	