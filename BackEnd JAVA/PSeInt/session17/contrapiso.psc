

Algoritmo contrapiso
	
FinAlgoritmo


SubProceso calcularContrapisos()
	definir espesorC como real
	Definir volumenC Como Real
	Definir anchoC como real
	Definir largoC Como Real
	Escribir "Ingrese el espesor del contrapiso en metros:"
	Leer espesorC
	Escribir "Ingrese el ancho del contrapiso en metros:"
	Leer anchoC
	Escribir "Ingrese el largo del contrapiso en metros:"
	Leer largoC
	
//	aca calculo el volumen del espesor con la funcion de arriba
	volumenC = calcularVolumen(espesorC,largoC,anchoC)
	
	//	aca calculo los materiales necesarios:
	cementoC = 105 * volumen
	arenaC = 0.45 * volumen
	piedraC = 0.9 * volumen
	
	Escribir "Para un contrapiso de ", espesorC, " metros de espesor, ", anchoC " metros de ancho y ", largoC, " metros de largo, se necesitan:"
	Escribir cementoC, " kg de cemento"
	Escribir arenaC, " m3 de arena"
	Escribir piedraC, " m3 de piedra"
FinSubProceso
