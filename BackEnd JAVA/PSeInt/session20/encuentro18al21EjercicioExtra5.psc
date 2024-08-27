Algoritmo encuentro18al21EjercicioExtra5
	
	definir vector Como Caracter
	definir n,posicion Como Entero
	Definir elemento,frase Como Caracter
	
	Dimension vector[20]
	
	hacer
		
		Escribir "Ingrese una frase que tenga como maximo 20 caracteres"
		leer frase
		
		n = Longitud(frase)
		
		si n > 20 Entonces
			Escribir ""
			Escribir "Ingrese una frase máximo 20 digitos"
			Escribir ""
		FinSi
		
	Mientras Que n > 20
	
	llenarArreglo(vector,frase,n)
	
	Escribir "Ingrese el elemento a agregar"
	leer elemento
	
	Hacer
		Escribir "Ingrese la posicion (0-19)"
		leer posicion
		
		si (posicion<0 o posicion>19) Entonces
			Escribir ""
			Escribir "Ingrese una posicion entre 0 y 19"
			Escribir ""
		FinSi
		
	Mientras Que posicion<0 o posicion>19
	
	agregarCaracter(vector,elemento,posicion)
	
FinAlgoritmo

SubProceso llenarArreglo (vector Por Referencia, frase Por Referencia,n Por Valor)
	
	Definir i Como Entero
	
	para i<-0 Hasta 19 Hacer
		
		si i<n Entonces
			vector[i] = Subcadena(frase,i,i)
		SiNo
			vector[i] = ""
		FinSi
		
	FinPara
	
FinSubProceso



SubProceso agregarCaracter(vector Por Referencia, elemento Por Valor, posicion por valor) 
	
	Definir i,j Como Entero
	Definir seguirMoviendo Como Logico
	
	si (vector[posicion] == "" o vector[posicion] == " ") Entonces
		
		vector[posicion] = elemento
		
	SiNo
		
		si posicion==0 Entonces
			mover(vector,posicion,elemento,"izquierda")
		sino 
			si posicion == 19 Entonces
				mover(vector,posicion,elemento,"derecha")
			SiNo
				
				seguirMoviendo = Verdadero
				j=1
				
				Mientras (seguirMoviendo) Hacer
					si (vector[posicion-j] == "" o vector[posicion-j] == " " o posicion-j==-1) Entonces
						mover(vector,posicion,elemento,"izquierda")
						seguirMoviendo = falso
					FinSi
					si (vector[posicion+j] == "" o vector[posicion+j] == " " o posicion+j==20) Entonces
						mover(vector,posicion,elemento,"derecha")
						seguirMoviendo = falso
					FinSi
					j=j+1
				FinMientras
				
			FinSi
		FinSi
		
	FinSi
	
	Escribir ""
	para i<-0 Hasta 19 Hacer
		si vector[i] == "" Entonces
			Escribir Sin Saltar "*"
		SiNo
			Escribir Sin Saltar vector[i]
		FinSi
		
	FinPara
	Escribir ""
	
	
	
FinSubProceso

SubProceso mover(vector Por Referencia, posicion Por Valor, nuevoElemento Por Valor,direccion Por Valor)
	
	Definir  i Como Entero
	Definir anterior,actual Como Caracter
	
	anterior = vector[posicion]
	vector[posicion] = nuevoElemento
	
	
	si direccion == "derecha" Entonces
		
		si posicion<19 Entonces
			para i<-posicion+1 Hasta 19 Hacer
				
				actual = vector[i]
				vector[i] = anterior
				anterior = actual
				
			FinPara
		FinSi
		
	SiNo
		
		si posicion>0 Entonces
			para i<-posicion-1 Hasta 0 Hacer
				
				actual = vector[i]
				vector[i] = anterior
				anterior = actual
				
			FinPara
		FinSi
		
	FinSi
	
FinSubProceso
