Algoritmo dosVectores
	
	definir vector1, vector2, num1, num2, i como real
	definir result Como Logico
	
	dimension vector1(5)
	dimension vector2(5)
	
	para i = 0 Hasta 4 Hacer
		num1 = 0
		num2 = 0
		num1 = Aleatorio(1,10)
		num2 = Aleatorio(1,10)
		vector1(i) = num1
		vector2(i) = num2
	FinPara
	
	result = may1(vector1, vector2)
	
	Escribir "es ", result, " que los dos arreglos son iguales"
FinAlgoritmo

funcion retorno= may1(vector1 Por referencia, vector2 Por referencia)
	
	definir retorno como logico
	definir j  Como Entero

	para j = 0 Hasta 4 Hacer
		Si vector1(j) == vector2(j)
			retorno = verdadero
		SiNo
			retorno = falso 
		FinSi
	FinPara
	
FinFuncion



