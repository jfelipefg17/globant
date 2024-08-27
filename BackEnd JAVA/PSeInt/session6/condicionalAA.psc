Algoritmo condicionalAA
	
	Definir defect, sinDefect Como Entero
	Definir var1,var2 Como Logico
	
	Leer defect,sinDefect
	
	var1=defect<200
	var2=sinDefect>1000
	
	Si var1 Entonces
		Si var2 Entonces
			Escribir "Grado 8"
		SiNo
			Escribir "Grado 6"
		FinSi
	Sino
		Si var2 Entonces
			Escribir "Grado 7"
		SiNo
			Escribir "Grado 5"
		FinSi
	FinSi
	
FinAlgoritmo
