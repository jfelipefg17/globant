Algoritmo vector 
	
	definir array como entero
	
	dimension array(5)
	
	numeross(array)
	
FinAlgoritmo

SubProceso numeross(array Por Referencia)
	definir num, i como entero
	i = 0
	
		para i = 0 Hasta 4 Hacer
			num = 0
			Escribir "ingrese un numero"
			leer num
			array(i) = num
		FinPara
	Si i > 4 
		para i = 0 Hasta 4 Hacer
			Escribir  "[", array(i), "] " Sin Saltar
		finpara
	finsi
FinSubProceso
	