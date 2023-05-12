//// Ej.4
//Algoritmo ej_4
//	Definir matriz1, matriz2, matrizFinal Como Entero
//	Dimension matriz1(3,3), matriz2(3,3), matrizFinal(3,3)
//	matrizAleatoria(matriz1,3,3)
//	matrizAleatoria(matriz2,3,3)
//	multiplicar2MatricesMismoTamano(matriz1,matriz2,matrizFinal,3)
//	mostrarMatriz(matriz1,3,3)
//	Escribir "x"
//	mostrarMatriz(matriz2,3,3)
//	Escribir "="
//	mostrarMatriz(matrizFinal,3,3)
//FinAlgoritmo
//
//funcion matrizAleatoria(matriz, n, m)
//	Definir i, j Como Entero
//	Escribir "Generando aleatoriamente una matriz " n "x" m "..."
//	Para i=0 Hasta n-1 Hacer
//		Para j=0 Hasta m-1 Hacer
//			matriz[i,j] = aleatorio(0,9)
//		FinPara
//	FinPara
//FinFuncion
//
//funcion multiplicar2MatricesMismoTamano(matriz1, matriz2, matrizFinal, n)
//	Definir i,j,k,suma Como Entero
//	Para i=0 Hasta n-1 Hacer
//		Para j=0 Hasta n-1 Hacer
//			suma=0
//			Para k=0 Hasta n-1 Hacer
//				suma=suma+matriz1[i,k]*matriz2[k,j]
//			FinPara
//			matrizFinal[i,j]=suma
//		FinPara
//	FinPara
//FinFuncion
//
//Funcion mostrarMatriz(matriz, n, m)
//	Definir i, j Como Entero
//	Para i=0 Hasta n-1 Hacer
//		Para j=0 Hasta m-1 Hacer
//			Si matriz[i,j]<1000 y matriz[i,j]>99 Entonces
//				Escribir Sin Saltar " " matriz[i,j] " "
//			FinSi
//			Si matriz[i,j]<100 y matriz[i,j]>9 Entonces
//				Escribir Sin Saltar "  " matriz[i,j] " "
//			FinSi
//			Si matriz[i,j]<10 Entonces
//				Escribir Sin Saltar "   " matriz[i,j] " "
//			FinSi
//			Si j=m-1 Entonces
//				Escribir ""
//			FinSi
//		FinPara
//	FinPara
//FinFuncion