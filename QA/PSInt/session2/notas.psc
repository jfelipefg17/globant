Algoritmo notas 
	
	Definir nota1, nota2, nota3 Como entero
	Definir notass Como Logico 
	Escribir "ingrese sus tres notas  "
	Leer nota1, nota2, nota3
	
	notass = (nota1 > 0 y nota1 <= 10) y (nota2 > 0 y nota2 <= 10) y (nota3 > 0 y nota3 <= 10) 
	
	SI notass == Verdadero
		Escribir "correctas"
	SiNo
		Escribir "incorrectas"
	FinSi
	
	
FinAlgoritmo
