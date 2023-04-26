Algoritmo convertirEspacios
	
	Definir textoo, textoo2 Como Caracter
	textoo2 = ""
	Escribir "ingrese un texto"
	Leer textoo
	
	convertirEspacio(textoo, textoo2)
	
	Escribir textoo2
FinAlgoritmo


SubProceso  convertirEspacio(textoo por valor, textoo2 por referencia)
	Definir i, j, h como entero
	Definir aux como caracter
	j = 0
	h = 0
	i = Longitud(textoo)
	aux =""
	
	mientras  j <= i hacer 
		
		aux = Concatenar(subcadena(textoo,h,j)," ")
		textoo2 = textoo2 + aux
		j = j + 1
		h =  h + 1
	FinMientras

FinSubProceso
	