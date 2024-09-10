Algoritmo menu
	calcularColumna()
FinAlgoritmo


//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//	cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.


SubProceso calcularColumna()
	Definir long, cemento, arena, piedra, hierro10, hierro4 Como Real
	Escribir "Por favor ingrese el el largo de la columna en metros: " Sin Saltar
	leer long
	Escribir""
	
	cemento=7.5*long
	arena=0.016*long
	piedra=0.016*long
	hierro10=6*long
	hierro4=3*long
	
	Escribir "Los materiales necesarios para ", long, " metros de columna son:"
	
	EScribir "Cemento: ", cemento, " kg"
	Escribir "Arena: ", arena, " m3"
	Escribir "Piedra: ", piedra, " m2"
	Escribir "Hierro del 10: ", hierro10, " m"
	Escribir "Hierro del 4: ", hierro4, " m"	
	
	
FinSubProceso




// Menu opción 8:
SubProceso calcularIluminacion()
	Definir ancho, largo Como Real
	Escribir "Ingrese el largo de la habitación en metros"
	Leer largo
	Leer ancho
	
	Escribir calcularSuperficie(largo, ancho) * .20, " metros cuadrados de iluminación natural mínima."
FinSubProceso
