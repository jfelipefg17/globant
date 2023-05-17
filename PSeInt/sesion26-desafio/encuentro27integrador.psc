
Algoritmo encuentro27integrador
	Definir palabra, matrizGen Como Caracter
	Definir m Como Entero
	Escribir "Ingrese una palabra o frase cualquiera"
	Leer palabra
	
	/// Determinamos la dimensión de la matriz calculando la raíz de la longitud de la palabra
	m = trunc(raiz(Longitud(palabra)))
	
	/// Verificamos que la secuencia iniciada tenga 9, 16 o 1369 caracteres.
	esValida(palabra)
	
	/// Ahora generamos la matriz a partir del vector. Se almacenará en la variable "matrizGen"
	Dimension matrizGen[raiz(Longitud(palabra)),raiz(Longitud(palabra))]
	generarMatriz(palabra, matrizGen)
	
	/// Mostramos la matriz generada por consola.
	imprimirMatriz(matrizGen, m, m)
	
	/// SubProceso de detección del gen Z.
	detectarGen(matrizGen, m)
	
FinAlgoritmo


SubProceso esValida(palabra Por Referencia)
	Definir i Como Entero
	Definir letraInvalida Como Logico
	letraInvalida = Falso

	Hacer
		/// Para verificar la longitud de la secuencia se utiliza un Mientras.
		Mientras (Longitud(palabra) <> 9 Y Longitud(palabra) <> 16 Y Longitud(palabra) <> 1369)
			Escribir Longitud(palabra)
			Escribir "La muestra no es válida. Debe tener 9, 16 o 1369 caracteres, además los caracteres sólo pueden ser A, B, C o D."
			Escribir "Ingrese una muestra válida:"
			Leer palabra
		FinMientras
		
		/// Para verificar que cada caracter ingresado sea A, B, C o D exclusivamente, se recorre cada letra dentro de la cadena.
		/// Otra forma de implementarlo sería utilizar un vector.
		Para i = 0 Hasta Longitud(palabra) - 1 Hacer
			Si Subcadena(palabra,i,i) <> "A" y Subcadena(palabra,i,i) <> "B" y Subcadena(palabra,i,i) <> "C" y Subcadena(palabra,i,i) <> "D" Entonces
				letraInvalida = Verdadero
			FinSi
		FinPara
		
		Si letraInvalida == Verdadero Entonces
			Escribir "Los caracteres sólo pueden ser A, B, C o D. Ingrese una secuencia válida:"
			Leer palabra
		FinSi
		
	Mientras Que letraInvalida == Verdadero
	
	Escribir "La secuencia ingresada es válida."
FinSubProceso

SubProceso generarMatriz(palabra, matrizGen Por Referencia)
	Definir i, j Como Entero
	Para i = 0 Hasta raiz(Longitud(palabra)) - 1 Hacer
		Para j = 0 Hasta raiz(Longitud(palabra)) - 1 Hacer
			matrizGen[i,j] = Subcadena(palabra, i*(raiz(Longitud(palabra)))  + j, i*(raiz(Longitud(palabra))) + j)
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz, m, n)
	Definir i, j Como Entero
	Para i = 0 Hasta m - 1
		Para j = 0 Hasta n - 1
			Escribir Sin Saltar "|", matriz[i,j], "|"
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso detectarGen(matrizGen, m)
	Definir i, j Como Entero
	Definir gen1, gen2 Como Caracter
	Definir existeGen Como Logico
	/// La variable lógica de control se inicializa como Verdadero. Apenas aparezca una desigualdad esta cambiará a Falso,
	/// cuando recorramos la matrizGen
	existeGen = Verdadero
	
	gen1 = matrizGen[0,0]
	gen2 = matrizGen[0,m-1]
	
	Para i = 0 Hasta m - 1
		Si gen1 <> matrizGen[i,i] Entonces
			existeGen = Falso
		FinSi
		
		Si gen2 <> matrizGen[i,m-1-i] Entonces
			existeGen = Falso
		FinSi
		
	FinPara
	
	Si existeGen == Verdadero Entonces
		Escribir "El gen Z ha sido detectado en la muestra!"
	SiNo
		Escribir "El gen Z no está presente en la muestra analizada."
	FinSi
FinSubProceso