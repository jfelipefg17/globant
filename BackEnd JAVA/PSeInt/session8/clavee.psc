Algoritmo clavee
	Definir clave, clave2 Como Caracter
	Definir intentos Como Entero
	
	clave = "eureka"
	intentos = 0
	
	hacer 
		Escribir "ingrese la clave"
		Leer clave2 
		intentos = intentos + 1
		
	Mientras Que (clave <> clave2) y (intentos < 3)
	
	Si intentos < 3
		Escribir "clave correcta"
	Sino 
		Escribir "superaste el numero de intentos"

	FinSi
	
FinAlgoritmo
