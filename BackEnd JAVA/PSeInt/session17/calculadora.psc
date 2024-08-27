Algoritmo calculadora 
	
	menu()

FinAlgoritmo

SubProceso menu()
	
	definir opt Como Entero
	definir resp Como Caracter
	opt = 9
	
	
	Hacer
		escribir ""
		escribir ""
		Escribir "deseas hacer un calculo"
		leer resp
		resp = Minusculas(resp)
		Si resp == "si" Entonces
			Escribir "1.! Calcular muro de ladrillo"
			Escribir "2.! Calcular viga de hormigón"
			Escribir "3.! Calcular columnas de hormigón"
			Escribir "4.! Calcular contrapisos"
			Escribir "5.! Calcular techo"
			Escribir "6.! Calcular pisos"
			Escribir "7.! Calcular pintura"
			Escribir "8.! Calcular iluminación"
			Escribir "9.! Salir"
			escribir ""
			escribir "ingrese opcion"
			Leer opt
			Segun opt Hacer
				1: calcularMuro()
				2: calcularViga()
				3: calcularColumna()
				4: calcularContraPisos()
				5: calcularTecho()
				6: calcularPisos()
				7: calcularPintura()
				8: calcularIluminacion()
				De Otro Modo:
					Escribir "Opcion no valida."
			FinSegun
		sino 
			opt = 9
		finsi
		
	Mientras Que opt <> 9

Escribir "Salio del programa. Muchas gracias"
FinSubProceso

Funcion superficie = calcularSuperficie(altoS , largoS)
	Definir superficie Como Real;
	superficie = largoS * altoS;
FinFuncion

Funcion volumen = calcularVolumen(espesorV, largoV , altoV)
	Definir volumen Como Real;
	volumen = espesorV * largoV * altoV;
FinFuncion

SubProceso calcularMuro()
	definir espesor, largo, alto, s, cmento, arna, ldrillos Como Real
	Escribir 'Espesor (20 ó 30 cm): ' 	
	Repetir
		
		Leer espesor
		
	Hasta Que  espesor = 20 o espesor = 30
	
	Escribir 'largo (m): ' Sin Saltar
	
	Leer largo
	
	Escribir 'alto (m): ' Sin Saltar
	
	Leer alto
	
	s<-calcularSuperficie(alto, largo)
	
	Escribir "Superficie del muro: ", s, " m2"
	
	Escribir "Cantidad de materiales de construcción: "
	
	si espesor = 30 Entonces
		
		cmento<-15.2*s
		
		arna <-0.115*s
		
		ldrillos <-120*s
		
	SiNo
		
		cmento<-10.9*s
		
		arna <-0.09*s
		
		ldrillos <-90*s
		
	FinSi
	escribir  cmento, "kg de cemento ", arna, "m3 de arena ", ldrillos " ladrillos"
FinSubProceso

subproceso calcularViga()
	definir m, cemento, arena, piedra, h8, h4 como real
	escribir "ingrese el largo de la viga en metros"
	leer m
	cemento = 9 * m
	arena = 0.02 * m
	piedra = 0.02 * m
	h8 = 4 * m
	h4 = 3 * m
	escribir cemento, "kg de cemento, ", arena, "m3 de arena, ", piedra, "m2 de piedra, ", h8 "m de hierro8, ", h4 "m de hierro4."
FinSubProceso

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

SubProceso calcularContrapisos()
	definir espesorC como real
	Definir volumenC Como Real
	Definir anchoC como real
	Definir largoC, cementoC, arenaC, piedraC Como Real
	Escribir "Ingrese el espesor del contrapiso en metros:"
	Leer espesorC
	Escribir "Ingrese el ancho del contrapiso en metros:"
	Leer anchoC
	Escribir "Ingrese el largo del contrapiso en metros:"
	Leer largoC
	
	//	aca calculo el volumen del espesor con la funcion de arriba
	volumenC = calcularVolumen(espesorC,largoC,anchoC)
	
	//	aca calculo los materiales necesarios:
	cementoC = 105 * volumenc
	arenaC = 0.45 * volumenc
	piedraC = 0.9 * volumenc
	
	Escribir "Para un contrapiso de ", espesorC, " metros de espesor, ", anchoC " metros de ancho y ", largoC, " metros de largo, se necesitan:"
	Escribir cementoC, " kg de cemento"
	Escribir arenaC, " m3 de arena"
	Escribir piedraC, " m3 de piedra"
FinSubProceso

SubProceso calcularTecho()
	Definir espesor, ancho, largo, volumen Como Real
	Escribir "Ingrese espesor en metros: "
	Leer espesor
	Escribir "Ingrese ancho en metros: "
	Leer ancho
	Escribir "Ingrese largo en metros: "
	Leer largo
	
	volumen=calcularVolumen(espesor, largo, ancho)
	
	Escribir "Necesita: "
	Escribir "· Cemento: " volumen*33 "kg."
	Escribir "· Arena: " volumen*0.072 "m3."
	Escribir "· Piedra: " volumen*0.072 "m3."
	Escribir "· Hierro del 8: " volumen*7 "m."
	Escribir "· Hierro del 6: " volumen*4 "m."
FinSubProceso

Subproceso calcularPisos()
	Definir  ancho, largo, resultado Como real
	
	Escribir "ingrese el ancho paño"
	Leer ancho
	
	Escribir "ingrese el largo paño"
	Leer largo
	
	resultado = calcularSuperficie(ancho, largo) * 0.1
	Escribir "El Paño debe ser de ", resultado, "m2"
	
FinSubProceso

SubProceso calcularPintura()
	Definir alto, largo Como real
	
	Escribir 'largo (m): ' Sin Saltar
	
	Leer largo
	
	Escribir 'alto (m): ' Sin Saltar
	
	Leer alto
	
	escribir "Ud necesitará: " (largo*alto)/6 " litros de pintura en total."
	
FinSubProceso

SubProceso calcularIluminacion()
	Definir ancho, largo Como Real
	Escribir "Ingrese el largo de la habitación en metros"
	Leer largo
	Leer ancho
	
	Escribir calcularSuperficie(largo, ancho) * .20, " metros cuadrados de iluminación natural mínima."
FinSubProceso