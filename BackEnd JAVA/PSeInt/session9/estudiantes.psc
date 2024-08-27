Algoritmo notas
	
	Definir integrador , exposicion , parcial , promedio , promedioFinal , max , porceInt , notaReprobado Como Real
	Definir estudiantes , contador, contadorInt, contadorPar , contadorReprobado , i Como Entero
	
	Escribir "Cantidad de estudiantes: " 
	Leer estudiantes
	
	promedio = 0
	promedioFinal = 0
	porceInt = 0
	contadorInt = 0
	contadorPar = 0
	contadorReprobado = 0
	max = 0
	contador = 0
	notaReprobado = 0
	
	Para i<-1 Hasta estudiantes Con Paso 1 Hacer
		Escribir "-----"
		Escribir "Nota del integrador: "
		Leer integrador
		Escribir "Nota del exposición: "
		Leer exposicion
		Escribir "Nota del parcial: "
		Leer parcial
		
		promedio = integrador * 0.35 + exposicion * 0.25 + parcial * 0.4
		
		Si promedio < 6.5 Entonces
			contadorReprobado = contadorReprobado + 1
			notaReprobado = notaReprobado + promedio
		FinSi
		
		Si integrador > 7.5 Entonces
			contadorInt = 1 + contadorInt
			porceInt = (contadorInt / estudiantes) * 100
		FinSi
		
		Si exposicion > max Entonces
			max = exposicion
		FinSi
		
		Si (parcial <= 7.5) y (parcial >= 4) Entonces
			contadorPar = 1 + contadorPar
		FinSi
		
	Fin Para
	Escribir "-----"
	notaReprobado = notaReprobado / contadorReprobado
	
	Escribir "Nota promedio final de los reprobados: " notaReprobado	
	Escribir "Porcentaje del integrador: " porceInt "%"
	Escribir "Nota máxima de exposiciones: " max
	Escribir "Estudiantes entre 4 y 7.5 en parcial: " contadorPar
	
FinAlgoritmo
