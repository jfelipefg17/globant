Algoritmo promedio 
	
	Definir nota1,nota2,nota3,nota4 Como Real
	
	Leer nota1,nota2,nota3,nota4
	
	Si (nota1>nota2 o nota1>nota3 o nota1>nota4) Entonces
		Si (nota2>nota3 o nota2>nota4) Entonces
			Si (nota3>nota4) Entonces
				Escribir "Nota final= ", (nota1+nota2+nota3)/3
			SiNo
				Escribir "Nota final= ", (nota1+nota2+nota4)/3
			FinSi
		SiNo
			Escribir "Nota final= ", (nota1+nota3+nota4)/3
		FinSi
	SiNo
		Escribir "Nota final= ", (nota2+nota3+nota4)/3
	FinSi
FinAlgoritmo
