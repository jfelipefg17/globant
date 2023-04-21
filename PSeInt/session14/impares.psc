Algoritmo impares
	definir num como entero
	Definir resultado como logico 
	
	Escribir "ingrese el numero"
	leer num
	
	resultado = encontrarPar(num)
	
	Si resultado ==
	Escribir ""
	
FinAlgoritmo

funcion retornmo = encontrarPar(num)
	
	definir retorno Como Logico
	
	mientras i <= num hacer
		i = i + 1
	    Si num%2 == 0 Entonces
			retorno = Verdadero
		SiNo
			retorno = Falso
		FinSi
		
	FinMientras
FinFuncion
