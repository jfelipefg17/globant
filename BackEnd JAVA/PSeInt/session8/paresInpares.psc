Algoritmo paresInpares
	
	Definir par, inpar, num, cont, suma1, suma2 como enteros 
	
	par = 0
	inpar = 0 
	cont = 0
	suma1 = 0
	suma2 = 0
	
	hacer 
		cont = cont +1
		Escribir "ingrese un numero"
		leer num 
		
		Si num%2 = 0 Entonces
			par = par + 1
			suma1 = suma1 + num
		SiNo
			inpar = inpar + 1
			suma2 = suma2 + num 
		FinSi
		
	Mientras Que cont < 10
	
	Escribir "la media de los numeros pares es: ", suma1/par
	Escribir "la media de los numeros inpares es: ", suma2/inpar
	
FinAlgoritmo
