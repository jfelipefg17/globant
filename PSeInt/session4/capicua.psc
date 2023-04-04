Algoritmo capicua
	Definir num, cen, uni Como Entero
	Escribir "Ingrese un número de 3 cifras"
	Leer num
	cen = trunc(num/100)
	uni = trunc((num%100)%10)
	Si cen == uni Entonces
		Escribir "El número es capicúa"
	SiNo
		Escribir "El número no es capicúa"
	Fin Si
FinAlgoritmo
