Algoritmo factorial
	
	Definir i, facto Como Entero;
	Definir iteracion Como Caracter;
	
	facto = 1;
	iteracion = "";
	
	Para  i = 1 Hasta 5 Con Paso 1 Hacer
		facto = facto * i;
		Mientras  i > 5 Hacer
			iteracion = ConvertirATexto(i) ;
		FinMientras
		iteracion = iteracion + "*" + ConvertirATexto(i) ;
		Escribir i, "! = " , iteracion, " = ", facto;
	FinPara
	
FinAlgoritmo