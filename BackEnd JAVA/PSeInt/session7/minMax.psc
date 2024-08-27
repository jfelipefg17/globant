Algoritmo minMax
	
	Definir min, max, num, suma, cont Como Entero
	cont = 0
	suma = 0
	num = 0
	
	Escribir "ingrese un minimo"
	Leer min
	
	Escribir "ingrese un maximo"
	Leer max
	
	Escribir "ingrese un numero "
	Leer num  
	
	Mientras ( num >= min ) y ( num <= max ) Hacer
		Escribir "ingrese un numero "
		Leer num 
		
		suma = suma + num 
		cont = cont + 1
		
	FinMientras
	
	Escribir "la cantidad de numeros ingresados fue ", cont
	Escribir "la suma de los numeros ingresados fue ", suma
	
FinAlgoritmo
