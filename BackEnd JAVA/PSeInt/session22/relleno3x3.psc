Algoritmo relleno3x3
	
	Definir num, matriz, i, j Como entero
	dimension matriz(3,3)
	
	
	para i = 0 Hasta 8 Hacer
		para j = 0 Hasta 8 Hacer
			num = 0
			Escribir "ingrese un numero"
			leer num
			matriz(i,j) = num
		Finpara
	FinPara
	
	
	para i = 0 Hasta 9 Hacer
		para j = 0 Hasta 9 Hacer
			Escribir matriz(i,j), " "
		Finpara
	FinPara
	
FinAlgoritmo

//// Ej.1
//Algoritmo ej_1
//	Definir matriz, i, j Como Entero
//	Dimension matriz(3,3)
//	Escribir "Ingrese los valores de una matriz 3x3."
//	Para i=0 Hasta 2 Hacer
//		Para j=0 Hasta 2 Hacer
//			leer matriz[i,j]
//		FinPara
//	FinPara
//	Escribir "Ahora mostramos la matriz."
//	mostrarMatriz(matriz,3,3)
//FinAlgoritmo
//
//Funcion mostrarMatriz(matriz, n, m)
//	Definir i, j Como Entero
//	Para i=0 Hasta n-1 Hacer
//		Para j=0 Hasta m-1 Hacer
//			Si matriz[i,j]<10 Entonces
//				Escribir Sin Saltar "  " matriz[i,j] " "
//			SiNo
//				Escribir Sin Saltar " " matriz[i,j] " "
//			FinSi
//			Si j=m-1 Entonces
//				Escribir ""
//			FinSi
//		FinPara
//	FinPara
//FinFuncion
