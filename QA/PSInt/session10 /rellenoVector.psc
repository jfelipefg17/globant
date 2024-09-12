Algoritmo rellenoVector
	
	definir vectorr, num, i, result como real
	dimension vectorr(5)
	
	para i = 0 Hasta 4 Hacer
		num = 0 
		Escribir "ingrese un numero"
		leer num
		vectorr(i) = num
	FinPara

	result = may(vectorr)
	
	escribir" "
	Escribir "en numero mas grande del array es: ", result
	
FinAlgoritmo

funcion retorno= may(vectorr Por referencia)
	definir retorno, j, s Como Entero
	s = 1
	para j = 0 Hasta 4 Hacer
		si vectorr(j) > vectorr(s) Entonces
			retorno = vectorr(j)
			s = s + 1
			j = j + 1
		FinSi
	FinPara
	
FinFuncion
	