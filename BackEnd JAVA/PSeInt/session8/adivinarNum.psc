Algoritmo adivinarNum
	definir random, num como entero 
	random = aleatorio(1,10)
	hacer 
		Escribir "ingresa un numero "
		Leer num 
		
		SI num > random Entonces
			Escribir "el numero es mas pequeno"
		SiNo
			Escribir "el numero es mas grande"
		FinSi
		
	Mientras Que num <> random
	
	Escribir "adivinaste el numero, era el ", random
	
FinAlgoritmo
