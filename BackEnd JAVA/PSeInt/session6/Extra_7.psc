Algoritmo Extra_7
	
	Definir nota1, nota2, nota3, nota4, menorNota, promedio Como Real
	
	Escribir "Ingrese la primera nota:"
	Leer nota1
	Escribir "Ingrese la segunda nota:"
	Leer nota2
	Escribir "Ingrese la tercera nota:"
	Leer nota3
	Escribir "Ingrese la cuarta nota:"
	Leer nota4
	
	menorNota = nota1
	Si nota2 < menorNota Entonces
		menorNota = nota2
	FinSi
	Si nota3 < menorNota Entonces
		menorNota = nota3
	FinSi
	Si nota4 < menorNota Entonces
		menorNota = nota4
	FinSi
	
	promedio = (nota1 + nota2 + nota3 + nota4 - menorNota) / 3
	
	Escribir "El promedio de las tres mejores notas es:", promedio
	Escribir "La nota menor, el cual fue eliminada es: ", menorNota
	
FinAlgoritmo