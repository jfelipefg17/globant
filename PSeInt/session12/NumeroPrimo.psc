//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
Funcion  retorno <- EsPrimo (num1)
	Definir retorno,i Como Entero
	retorno = 0
	para i = 1 hasta num1 Con Paso 1 Hacer
		si num1 % i == 0 Entonces
			retorno = retorno +1
		FinSi
		
		
	FinPara
	
Fin Funcion

Algoritmo NumeroPrimo
	Definir num1 Como entero
	Escribir "Ingrese el número"
	Leer num1
	
	si EsPrimo(num1) = 2 entonces 
		Escribir "El número ingresado es primo"
	SiNo
		Escribir "El número ingresado no es primo"
	FinSi
	
	
FinAlgoritmo