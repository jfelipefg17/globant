Algoritmo ejer2
	
	Definir num , cont Como entero
	
	Escribir "escribir un numero"
	leer num
	
	cont = 0 	
	
	
	
	Repetir /// hacemos un do while o hacer mientras que --> para que se repìta una vez si o si, por si la persona pone un 0
		num = trunc(num / 10) 
		cont = cont + 1
	Mientras Que num > 0 
	Escribir " la cantidad de digitos del numero es " cont
FinAlgoritmo