Algoritmo ejercicios_dia_doce
	Definir num Como Entero;
	Definir solucion Como Caracter;
	
	Escribir "Ingrese un numero";
	Leer num;
	
	solucion = Calcular(num);
	
FinAlgoritmo

Funcion retorno = Calcular(num) 
	Definir auxiliar, numInv Como Entero;
	auxiliar = num;
	numInv = 0;
	Mientras auxiliar > 0
		numInv = numInv + auxiliar MOD 10;
		numInv = numInv * 10;
		auxiliar = trunc(auxiliar / 10)
	FinMientras
	numInv = numInv / 10;
	Si num = numInv Entonces
		Escribir "El numero es capicua";
	SiNo
		Escribir "El numero NO es capicua";
	FinSi
FinFuncion