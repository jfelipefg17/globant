Algoritmo forma_geometric
	
	definir base Como Entero
	definir altura Como Entero
	definir i Como Entero
	definir j Como Entero
	
	escribir 'ingrese una base'
	leer base
	
	escribir 'ingrese una altura'
	leer altura
	
	para i = 1 hasta base hacer 
		escribir sin saltar '* '
		
	FinPara
	
	escribir ' '
	
	para j= 1 hasta altura - 2 hacer 
		escribir sin saltar '* '
		para i = 1 hasta base - 2 hacer
			escribir sin saltar '  '
		FinPara
		escribir '* '
	FinPara
	
	para i = 1 hasta base hacer 
		escribir sin saltar '* '
		
	FinPara
	
FinAlgoritmo

Algoritmo Ejercicios_dia_diez
	Definir num Como Entero;
	Definir i Como Entero;
	Definir j Como Entero;
	
	Escribir "Ingresa un numero";
	Leer num;
	Para i = 1 Hasta num Hacer
		Para j = 1 Hasta  num Hacer
			Si i > 1 Y i < num Y j > 1 Y j < num Entonces
				Escribir "   " Sin Saltar; 
			SiNo
				Escribir "*  " Sin Saltar;
			FinSi
		FinPara
		Escribir "";
	FinPara
FinAlgoritmo
