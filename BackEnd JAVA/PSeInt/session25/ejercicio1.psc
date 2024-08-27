////Realizar un programa que rellene de números aleatorios una matriz a través de un
////subprograma y generar otro subprograma que muestre por pantalla la matriz final.
////muestre la suma de los elementos de la matriz.
Algoritmo sin_titulo
	
	definir matriz como entero
	dimension matriz(3,3)
	
	random(matriz)
	print(matriz)
	
FinAlgoritmo

subproceso random(matriz Por Referencia)
	definir i,j,num como entero 
	
	para i = 0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer 
			num = 0
			num = aleatorio(1,9)
			matriz(i,j) = num
		FinPara
	FinPara
	
FinSubProceso

subproceso print(matriz Por Referencia)
	definir i,j,num como entero 
	
	para i = 0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer 
			escribir matriz(i,j) , " " sin saltar
		FinPara
		escribir ""
	FinPara
	
FinSubProceso
