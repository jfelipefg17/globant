SubProceso TemperaturaMedia(i Por Valor, tMax Por Referencia, tMin Por Referencia, Tmedia Por Referencia)
	
	Escribir "Ingrese la temperatura máxima del día ", i, ":"
	Leer tMax
	Escribir "Ingrese la temperatura mínima del día ", i, ":"
	Leer tMin
	tMedia = (tMax + tMin) / 2
	
FinSubProceso		

Algoritmo P2_Temperatura
	
	Definir tMax, tMin, Tmedia Como Real
	Definir n, i Como Entero
	
	Escribir "¿Cuántos días va ingresar?"
	Leer n
	
	i = 1
	
	Hacer 
		TemperaturaMedia(i, tMax,tMin, tMedia)
		Escribir "La temperatura media del día ", i , " es: ", tMedia
		Escribir ""
		i = i + 1
	Mientras Que i = n

FinAlgoritmo
