Subproceso calcularPisos()
	Definir  ancho, largo, resultado Como real
	
	Escribir "ingrese el ancho paño"
	Leer ancho
	
	Escribir "ingrese el largo paño"
	Leer largo
	
	resultado = calcularSuperficie(ancho, largo) * 0.1
	Escribir "El Paño debe ser de ", resultado, "m2"
	
FinSubProceso