Algoritmo  desafio1
	definir  i , c, num Como Entero
	
	Escribir "escribe un numero"
	
	para i = 1 hasta 5 con paso 1 Hacer  /// hago un bucle que se repita 5 veces como lo pide el ejerc
		/// cada vez qeu se repite ese bucle pide un numero nuevo y dependiendo de el se realizara otro bucle
		
		leer num 
		si num <=20 y num > 0 Entonces  /// hago el si y sino de que el num sea menor de 20
			Escribir Sin Saltar num " "
			para c = num hasta 1 con paso -1 Hacer  /// este bucle se repite las veces que se ponga el numero desde el num hasta 1 con paso menos 1 , lo que hara que escriba sin saltar los *
				Escribir sin saltar   "*"
			FinPara
		sino 
			Escribir "el numero debe ser menor a 20, escribalo nuevamente "
			leer num
			para c = num hasta 1 con paso -1 Hacer
				Escribir sin saltar   "*"
			FinPara
		FinSi
		
		
		Escribir  " "
		
	FinPara
FinAlgoritmo
// que no los imprima numero por numero sino que ingrese los 5 numeros y despues imprima los 5 