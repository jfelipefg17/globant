Algoritmo alumnos 
	Definir nota1, nota2, nota3, notaFinal Como Real
	Definir nombre Como Caracter 
	
	Escribir "ingresa tu nombre"
	Leer nombre 
	
	Mientras nombre <> "" Hacer
		
		
		Escribir "ingresa tu nota parte practica"
		Leer nota1 
		
		Escribir "ingresa tu nota parte problemas"
		Leer nota2
		
		Escribir "ingresa tu nota parte teorica"
		Leer nota3
		
		Si ((nota1) >= 0 y (nota1 <= 10)) y ((nota2) >= 0 y (nota2 <= 10)) y  ((nota3) >= 0 y (nota3 <= 10))
			notaFinal = (nota1*0.1) + (nota2*0.5) + (nota3*0.4)
			Escribir "tu nota final seria ", notaFinal
		SiNo 
			Escribir "verifica que tus tres notas esten entre 0 y 10"
		FinSi
		
		Escribir "ingresa tu nombre"
		Leer nombre 
		
	FinMientras
	
	
FinAlgoritmo
