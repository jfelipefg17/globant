Algoritmo maquinaDeReciclaje
	Definir usuario, contrasena, opcionMenu Como Caracter
	Definir login Como Logico
	Definir intentos, saldo, botellasIngresadas Como Entero
	login = falso 
	intentos = 0
	saldo = 0
	
	Escribir "Bienvenido a la maquina de reciclaje"
	Escribir "ingrese su usuario"
	Leer usuario
	Si usuario = "Albus_D"
		Mientras intentos < 3 y login = falso Hacer
			
			Escribir "ingrese la contraseña"
			leer contrasena
			intentos = intentos +1
			si contrasena == "caramelosDeLimon" Entonces
				login = Verdadero
			sino 
				Escribir "la contraseña es incorrecta. Intento", intentos, " de 3"
				
			FinSi
		FinMientras
	SiNo
		
		Escribir "usuario incorrecto"
		
		
		si login == Verdadero Entonces
			Escribir "Bienvenido ", usuario
			Repetir
				Escribir "menu de opciones"
				Escribir "1. ingresar botellas"
				Escribir "2.consultar saldo"
				Escribir "3. salir"
				Leer opcionMenu
				
				Segun opcionMenu hacer 
					"1": Escribir "ingrese la cantidad de botellas a reciclar"
						leer botellasIngresadas
						saldo = saldo + 
				FinSegun
				Hasta Que		
				
			FinMientras
			
		FinSi
		
		
		
finAlgoritmo
