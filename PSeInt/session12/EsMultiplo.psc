Algoritmo multiplo 
	
	Definir num1, num2 Como Real
	definir resultado como logico 
	
	escribir "ingrese un numero "
	leer num1
	
	escribir "ingrese un numero "
	leer num2
	
	resultado = EsMultiplo (num1 , num2 )
	
	Escribir resultado
	
FinAlgoritmo

funcion retorno = EsMultiplo (num1, num2)
	definir retorno Como Logico
	retorno = num2%num1 == 0
FinFuncion
