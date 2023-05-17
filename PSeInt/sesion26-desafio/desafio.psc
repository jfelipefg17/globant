Algoritmo desafio
	
	definir matriz, matriznueva como caracter
	Definir f, c, resultado como entero
	f = 9
	c = 12
	dimension matriz(f,c)
	dimension matriznueva(f,c)
	inicializar(matriz,f,c)
	inicializar(matriznueva,f,c)
	print(matriz,f,c)
	
	agregarPalabra(matriz, 0, "VECTOR")
	agregarPalabra(matriz, 1, "MATRIX")
	agregarPalabra(matriz, 2, "PROGRAMA")
	agregarPalabra(matriz, 3, "SUBPROGRAMA")
	agregarPalabra(matriz, 4, "SUBPROCESO")
	agregarPalabra(matriz, 5, "VARIABLE")
	agregarPalabra(matriz, 6, "ENTERO")
	agregarPalabra(matriz, 7, "PARA")
	agregarPalabra(matriz, 8, "MIENTRAS")
	
	acomodarPalabra(matriz,matriznueva)
	
	print(matriznueva,f,c)
	
	
FinAlgoritmo

SubProceso inicializar(matriz Por Referencia, f Por Referencia, c por referencia)
	Definir i, j como entero
	
	para i = 0 Hasta f-1 Hacer
		para j = 0 Hasta c-1 Hacer
			matriz(i,j) = "*"
		FinPara
	FinPara
	
FinSubProceso

SubProceso print(matriz Por Referencia, f Por Referencia, c por referencia)
	Definir i, j como entero
	
	para i = 0 Hasta f-1 Hacer
		para j = 0 Hasta c-1 Hacer
			escribir " ", matriz(i,j), " " Sin Saltar
		FinPara
		escribir ""
	FinPara
	
FinSubProceso

SubProceso agregarPalabra(matriz,f,palabra )
	Definir i, j Como Entero
	
	Para i=f Hasta f Hacer
		
		Para j=0 Hasta Longitud(palabra)-1 Hacer
			
			matriz(i,j) = SubCadena(palabra,j,j)
			Escribir Sin Saltar " ", matriz(i,j), " "
			
		FinPara
		Escribir " "
	FinPara
	
	
FinSubProceso

Funcion R<-buscarR(matriz, fila)
	Definir j, R Como Entero
	Para j <- 11 Hasta 0 Con Paso -1 Hacer		
		Si matriz[fila,j] = "R" Entonces
			R<- j
		Fin Si
	Fin Para

Fin Funcion

SubProceso  acomodarPalabra(matriz, matriznueva)
	Definir palabra Como Caracter
	Definir i, j, posicion Como Entero
	
	Para i=0 Hasta 8 Hacer
		posicion = buscarR(matriz, i)
		Para j=0 Hasta 11 Hacer
			Si j+5-posicion <= 11 Entonces
				matriznueva(i,j+5-posicion) = matriz(i,j)
			FinSi			
		FinPara
	FinPara
FinSubProceso
	

