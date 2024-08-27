////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
////encontrando la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////		H A B
////		I L I
////		D A D
////	???????Nota: recordar el uso de la función Subcadena().

Algoritmo sin_titulo
	
	definir matriz como caracter
	dimension matriz(3,3)
	
	random(matriz)
	print(matriz)
	
FinAlgoritmo

subproceso random(matriz Por Referencia)
	
	definir i,j,a,b como entero 
	definir frase Como Caracter
	a = 0
	b = 0
	Escribir "ingrese una frase de max 9 caracteres"
	leer frase 
	
	para i = 0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer 
			matriz(i,j) = subcadena(frase,a,b)
			a = a + 1
			b = b + 1
		FinPara
	FinPara
	
FinSubProceso

subproceso print(matriz Por Referencia)
	definir i,j,num como entero 
	
	para i = 0 Hasta 2 Hacer
		para j = 0 hasta 2 hacer 
			escribir matriz(i,j) , " " sin saltar
		FinPara
		escribir ""
	FinPara
	
FinSubProceso