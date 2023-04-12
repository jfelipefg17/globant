Algoritmo eje2_dia8
	Definir num, numeroMaximo, numeroMinimo, suma, promedio, x Como real
	numeroMaximo=0
	numeroMinimo=999999999999999
	suma=0
	promedio=0
	x=0
	Repetir
		Escribir "ingresa un numero"
		leer num
		
		Si num>numeroMaximo  Entonces
			numeroMaximo=num
			
		Fin Si
		
		Si num<numeroMinimo y num<>0 Entonces
			numeroMinimo=num
			
		Fin Si
		
		suma=suma+num
		x=x+1
		promedio=suma/x
		
	Mientras Que num<>0
	
	si promedio=0 Entonces
		Escribir " El primer numero no puede ser cero"
		
	sino 
		Escribir "El maximo numero ingresado es ", numeroMaximo
		Escribir "El minimo numero ingresado es ", numeroMinimo
		Escribir "El promedio entre los numeros es de " , promedio
	FinSi
	
	
	
	
	
FinAlgoritmo