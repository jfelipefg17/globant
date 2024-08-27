Algoritmo letraEnCadena
	
	definir frase, letra Como Caracter
	definir contador, i, j  Como Entero 
	
	Escribir "ingrese una frase"
	leer frase
	
	i = longitud(frase)
	j = 0
	Escribir "ingrese una letra"
	leer letra
	
	contador = numeroLetra (frase, letra, i, j )
	
	Escribir "la ", letra, " en la frase ", frase, " esta ", contador, " veces"
	
FinAlgoritmo

funcion retorno = numeroLetra(frase, letra, i, j)
	definir retorno como real 
	retorno = 0
	Para j = 0 Hasta i Hacer
		si subcadena(frase,j,j) == letra Entonces
			retorno = retorno + 1
		FinSi
	FinPara
	
FinFuncion
