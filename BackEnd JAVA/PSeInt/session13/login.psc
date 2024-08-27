Algoritmo login
	
	Definir usuario, contrasena, clave, tipo Como Caracter
	Definir resultado, acceso como logico
	definir i Como Entero
	
	clave = "asdasd"
	tipo = "usuario1"
	i = 0
	
	Hacer
    i = i + 1
	Escribir "ingrese contrasena"
	Leer contrasena
	
	Escribir "ingrese usuario"
	Leer usuario 
	
	resultado <- verificacion ( usuario, contrasena, clave, tipo)
	
mientras que (i < 3) y (resultado <> VERDADERO )

si i = 3 Entonces
	escribir "se te acabaron los intentos"
SiNo
	escribir "tiene acceso"
FinSi


FinAlgoritmo

	funcion retorno = verificacion (usuarioo, contrasenaa, clavee, tipoo)
		definir retorno como logico 
	
	
		Si (usuarioo == tipoo) y (clavee == contrasenaa) Entonces
		
			retorno = VERDADERO 
			
		SiNo
			
			retorno  = Falso
		FinSi
	
FinFuncion


	