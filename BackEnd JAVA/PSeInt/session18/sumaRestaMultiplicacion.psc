Algoritmo sumaRestaMultiplicacion
	
	Definir vector, i, num como entero
	
	Dimension vector(10) 
	
	para i = 0 Hasta 9 Hacer
		num = 0
		Escribir "ingrese un numero"
		Leer num
		vector(i) = num
	FinPara
	
	suma(vector)
	resta(vector)
	multiplicacion(vector)
	
FinAlgoritmo

SubProceso suma(vector por referencia)
	definir num2, i como entero
	num2 = 0
	para i = 0 Hasta 9 Hacer
		num2 = vector(i) + num2
		
	FinPara
	Escribir "la suma de los numeros seria ", num2
FinSubProceso


SubProceso resta(vector por referencia)
	definir num2, i como entero
	num2 = 0
	para i = 0 Hasta 9 Hacer
		num2 = vector(i) - num2
	FinPara
	Escribir "la resta de los numeros seria ", num2
FinSubProceso


SubProceso multiplicacion(vector por referencia)
	definir num2, i como entero
	num2 = 1
	para i = 0 Hasta 9 Hacer
		num2 =  num2 * vector(i) 
	FinPara
	Escribir "la multiplicacion de los numeros seria ", num2
FinSubProceso
	