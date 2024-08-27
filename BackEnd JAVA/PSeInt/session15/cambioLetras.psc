Algoritmo ejercicio4
	
	definir frase como caracter

	escribir 'Por favor ingrese una frase o palabra ' 
	leer frase 
	
	chequeo(frase)
	cambio(frase) 
	
FinAlgoritmo

SubProceso cambio(frase) 
	definir i como entero 
	para i<- 0 Hasta Longitud(frase) Hacer
		segun Subcadena(frase, i, i) hacer
			caso 'a' o 'A' : escribir Sin Saltar '@'
			caso 'e' o 'E' : escribir Sin Saltar '#'
			caso 'i' o 'I' : escribir Sin Saltar'$'
			caso 'o' o 'O' : escribir Sin Saltar'%'
			caso 'u' o 'U' : escribir Sin Saltar'*'
			De Otro Modo: escribir sin saltar Subcadena(frase, i, i)
 
		FinSegun
	FinPara
FinSubProceso

SubProceso chequeo(frase) 
	definir a como entero
	a = Longitud(frase)
	
	
		si Subcadena(frase, (a-1) ,(a-1) ) <> '.' Entonces
			escribir 'Ingrese la frase nuevamente con . al final'
			leer frase

		FinSi
FinSubProceso
