Algoritmo buscarArray
	
	Definir vector, num, i, num2 como entero
	
	Dimension vector(5)
	
	para i=0 Hasta 4 Hacer
		num = 0
		Escribir "ingrese un numero"
		leer num
		vector(i) = num
	FinPara
	
	escribir "ingrese el numero a buscar"
	leer num2
	
	buscar(vector, num2)
	
FinAlgoritmo


SubProceso buscar(vector Por Referencia, num2 Por valor)
	Definir j, vector2 Como Real
	dimension vector2(5)
	para j=0 Hasta 4 Hacer
		si num2 == vector(j)
			vector2(j) = 1
		SiNo
			vector2(j) = 0
		FinSi
	FinPara

	Escribir "el numero se repite en las siguientes posiciones: "
	para j=0 Hasta 4 Hacer

		escribir "[", vector2(j), "]" sin saltar
		
	finpara
FinSubProceso
