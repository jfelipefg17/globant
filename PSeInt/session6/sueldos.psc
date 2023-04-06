Algoritmo sueldos
	
	Definir  sueldo Como Caracter 
	Definir sueldo1, sueldo2, sueldo3, hora, horas Como Real
	
	Escribir "ingrese su tipo de sueldo"
	Escribir "A para comision "
	Escribir "B para salario fijo y comision"
	Escribir "C salario fijo"
	Leer sueldo 
	
	sueldo = Minusculas(sueldo)
	Si sueldo == "a" Entonces
		
		Escribir "cantidad total vendida esta semana"
		leer sueldo1
		Escribir "tu comision sera de: ", sueldo1 * 0.4
		
	Sino 
			Escribir "valor que se paga por cada hora: "
			Leer hora
			
			Escribir "cantidad de horas trabajadas "
			Leer horas
			
			si sueldo == "b" Entonces
			
				si horas > 40 Entonces
					horas = 40
				FinSi
				
				Escribir "cantidad total vendida esta semana"
				leer sueldo2
				
				Escribir "tu comision es: ", (sueldo2 * 0.25) + (hora * horas) 
				
			SiNo si horas > 40 Entonces
					Escribir "tu salario seria ",(40 * hora) + (horas - 40) * 1.5
					
				sino Escribir " tu sueldo seria ", hora * horas
				FinSi
				
		Fin si
	
	FinSi
	
FinAlgoritmo
