Algoritmo digitos
	
	Definir num, cont Como Entero
	cont = 0
	num = 0 
	
	Escribir "ingrese un numero"
	Leer num
	
	Si num == 0 Entonces
		Escribir "la cantidad de digitos es 1"
		
	SiNo
		Mientras num > 0 Hacer
			cont = cont + 1
			num = trunc(num/10)
		FinMientras
		
		Escribir "la cantidad de digitos es ", cont 
	FinSi
	
FinAlgoritmo
