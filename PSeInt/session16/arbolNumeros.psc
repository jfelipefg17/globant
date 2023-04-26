Algoritmo Encuentro_15_16_7
	Definir altura Como Entero
	
	Escribir "Ingrese la altura de la escalera"
	Leer altura
	
	escalera(altura)
	
FinAlgoritmo


SubProceso escalera(h)
	Definir i, j Como Entero
	Para i = 1 Hasta h
		Para j=1 Hasta i
			Escribir sin saltar j
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	