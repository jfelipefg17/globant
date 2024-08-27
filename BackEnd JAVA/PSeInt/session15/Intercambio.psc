SubProceso intercambioVar(a Por Referencia,b Por Referencia)
	Definir aux Como Entero
	aux = a
	a = b
	b = aux
	
FinSubProceso

Algoritmo Intercambio
	Definir a,b Como Entero
	Escribir "Ingrese el valor entero de la variable A"
	Leer a
	Escribir "Ingrese el valor entero de la variable B"
	Leer b
	intercambioVar(a,b)
	Escribir "El valor de la variable A es: ", a
	Escribir "El valor de la variable B es: ", b
FinAlgoritmo