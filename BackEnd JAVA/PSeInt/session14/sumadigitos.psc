Algoritmo sumadigitos
	Definir num Como Entero
	Escribir "Ingrese numero a evaluar: "
	Leer num
	Escribir "La suma de los digitos de ",num," es ",sumdigitos(num)
FinAlgoritmo

funcion aux = sumdigitos(num)
	Definir aux , i Como Entero
	i = 0
	aux = 0
	Mientras num > 0 Hacer 
		i = num mod 10
		aux = aux + i
		num = trunc(num/10)
	FinMientras
FinFuncion