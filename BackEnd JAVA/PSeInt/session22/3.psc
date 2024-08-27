Algoritmo sin_titulo
	Definir arreglo, n, m Como Entero
	Escribir "Qué tamaño desea que tenga el arreglo?"
	Escribir "Ingrese el valor de n"
	Leer n
	Escribir "Ingrese el valor de m"
	Leer m
	Dimension arreglo[n, m]
	

	aleator(arreglo, n, m)
	suma(arreglo, n, m)
	
FinAlgoritmo

SubProceso aleator(arreglo, n, m)
	Definir i, j Como Entero
	Para i <- 0 Hasta n-1 Hacer
		Para j <- 0 Hasta m-1 Hacer
			arreglo[i , j] = aleatorio(0 , 100)
			Escribir arreglo[i, j]
		FinPara
	FinPara
FinSubProceso

SubProceso suma(arreglo, n, m)
	Definir i, j Como Entero
	Definir more Como Entero
	more = 0
	Para j<- 0 Hasta m-1 Hacer
		Para i <- 0 Hasta n-1 Hacer
			more = more + arreglo[i, j] 
		FinPara
	FinPara
	Escribir "La suma total de los arreglos es de " more
FinSubProceso
