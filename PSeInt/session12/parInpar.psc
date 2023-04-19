Algoritmo parInpar 
	
	definir num como entero
	definir par como logico 
	
	escribir "ingrese un numero"
	leer num
	
	par = pares(num)
	
	Escribir "el numero es ", par
	
FinAlgoritmo

funcion retornar = pares (num)
	definir retornar Como Logico
	retornar = num % 2 <> 0
FinFuncion
	