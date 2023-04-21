Algoritmo fibonacci
	Definir num Como Entero
	Escribir "Ingrese numero a evaluar en Fibonacci: "
	Leer num
	Escribir "Fibo(",num,") = ",fibo(num)
FinAlgoritmo

Funcion aux = fibo(num)
	Definir aux Como Entero
	Si num <= 1 Entonces
		aux = 1 
	SiNo
		aux = fibo(num-1) + fibo(num-2)
	FinSi
FinFuncion