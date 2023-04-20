Algoritmo fabrica
	
	definir horas, resultado Como real
	definir nombre, dia, turno, festivo Como Caracter
	
	Escribir "ingrese nombre"
	leer nombre 
	
	Escribir "ingrese dia"
	leer dia
	
	Escribir "ingrese turno"
	leer turno
	
	Escribir "ingrese horas"
	leer horas
	
	Escribir "ingrese si era festivo"
	leer festivo
	
	resultado = pago(turno, horas, festivo)
	Escribir "el pago de ", nombre, " por trabajar el dia ", dia, " es ", resultado
	
FinAlgoritmo

funcion retorno <- pago(turnoo Por Referencia, horass Por Referencia, festivoo Por Referencia)
	
	definir retorno como real
	definir diurna, nocturna como entero
	
	diurna = 90000
	nocturna = 125000
	
	Si turnoo == "diurna" Entonces
		retorno = horass * diurna
		si festivoo == "si" entonces 
			retorno = retorno * 0.1
		FinSi
	SiNo
		retorno = horass * nocturna
		si festivoo == "si" entonces 
			retorno = retorno * 0.15
		FinSi
	FinSi
	
	
	
	
	
	
FinFuncion


