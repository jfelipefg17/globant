Algoritmo sin_titulo
	definir letra Como Caracter
	definir VOF Como Logico
	
	Escribir "Ingrese una letra"
	leer letra
	
	entreDosLetras(letra, VOF)
	
	Escribir "La letra esta entre la m y la t? " VOF
	
FinAlgoritmo


SubProceso entreDosLetras(letra, VOF Por Referencia)
	
	VOF = Falso
	
	si letra <= "T" y letra >= "M" Entonces
		VOF = Verdadero
	FinSi
	
FinSubProceso