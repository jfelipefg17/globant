Algoritmo condicionalM
	
	Definir num1, num2  Como Real
	
	
	Definir operador Como Caracter
	
	Escribir "ingrese dos numeros"
	Leer num1, num2
	
	Escribir "ingrese la operacion que quiere realizar de la siguiente manera"
	Escribir "suma = S "
	Escribir "restar = R "
	Escribir "multiplicar = M "
	Escribir "dividir = D "
	Leer operador 
	
	operador = Minusculas(operador)
	
	
	Segun operador Hacer 
		"s" :
			Escribir "la suma seria: ", num1 + num2 
		"r" :
			Escribir "la resta seria: ", num1 - num2
		"m" :
			Escribir "la multiplicacion seria: ", num1 * num2
		"d" :
			Escribir "la division seria: ", num1 / num2
			
		De Otro Modo:
			Escribir "ingresaste un valor invalido"
	FinSegun
FinAlgoritmo
