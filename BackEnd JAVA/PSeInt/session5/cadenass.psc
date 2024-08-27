Algoritmo cadenass
	
	Definir frase  Como Caracter
	Definir aux Como Entero
	
	Escribir "escriba una frase"
	Leer frase
	
	aux = Longitud(frase)
	
	Si Subcadena(frase,0,0) == Subcadena(frase,aux-1,aux-1)
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
