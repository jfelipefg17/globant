Funcion retorno <- Comparar ( num1 por referencia,num2 por referencia )
	
	definir retorno como logico
	retorno = num1 >= num2
	
FinFuncion

	Algoritmo Prueba
		Definir num1, num2 Como Entero
		definir resultado Como logico
		
		Escribir "ingrese un numero"
		leer num1
		
		Escribir "ingrese un numero"
		leer num2
		
		resultado = comparar(num1, num2)
		
		Escribir "El num1 es mayor a num2, esta afirmación es: " resultado
FinAlgoritmo
