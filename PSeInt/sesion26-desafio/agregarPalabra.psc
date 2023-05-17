Algoritmo Agregar_Palabra
	
FinAlgoritmo

SubProceso agregarPalabra(matriz, palabra, f)
	Definir i, j Como Entero
	
	Para i=f Hasta f Hacer
		
		Para j=0 Hasta Longitud(palabra)-1 Hacer
			
			matriz(i,j) = SubCadena(palabra,j,j)
			Escribir Sin Saltar matriz(i,j)
			
		FinPara
		
	FinPara
	
	
FinSubProceso
	