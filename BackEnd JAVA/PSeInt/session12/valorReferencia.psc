Algoritmo valorVSreferencia
	
	Definir num Como Entero
	num = 2
	
	Escribir num
	Escribir "Ahora enviamos el número a la función por valor y elresultado es:"
	
	elevarAlCuadradoPorValor(num)
	
	Escribir num
	Escribir "***********"
	Escribir "Ahora enviamos el número a la función por referencia y elresultado es:"
	
	elevarAlCuadradoPorReferencia(num)
	Escribir num
	
FinAlgoritmo

SubProceso elevarAlCuadradoPorValor(num Por Valor)
	num = num * num
FinSubProceso

SubProceso elevarAlCuadradoPorReferencia(num Por Referencia)
	num = num * num
FinSubProceso