Algoritmo sin_titulo
	Definir matriz Como Entero
	Definir n, m Como Entero
	Definir flag Como Logico
	Hacer
		Escribir 'Ingrese el orden de la matriz n*m'
		Leer n
	Mientras Que n > 10
	m = n
	Dimension matriz[n, m]
	
	llenarMatriz(matriz, n, m)
	flag = checkMatrizMagica(matriz, n, m)
	
	Si flag
		Escribir 'La matriz es magica'
	SiNo
		Escribir 'La matriz no es magica'
	FinSi
FinAlgoritmo

SubProceso llenarMatriz(mat, n, m)
	Definir i, j Como Entero
	Para i = 0 Hasta n - 1
		Para j = 0 Hasta m - 1
			Hacer
				Escribir Sin Saltar 'Ingrese el valor del elemento [', i, ',', j, ']'
				Leer mat[i,j]
			Mientras Que mat[i,j] < 1 o mat[i,j] > 9
		FinPara
	FinPara
FinSubProceso

Funcion return = checkMatrizMagica(mat, n, m)
	Definir i, j Como Entero
	Definir f, c, d1, d2, aux Como Entero
	Definir return Como Logico
	d1 = 0
	d2 = 0
	aux = 0
	return = Verdadero
	Para i = 0 Hasta n - 1
		f = 0
		c = 0
		Para j = 0 Hasta m - 1
			f = f + mat[i,j]
			c = c + mat[j,i]
			Si i == j
				d1 = d1 + mat[i,j]
			FinSi
			Si i + j == n - 1
				d2 = d2 + mat[i,j]
			FinSi
		FinPara
		Si i == 0
			aux = f
		FinSi
		Si f <> aux
			i = 3
			return = Falso
		FinSi
		Si c <> aux
			j = 3
			return = Falso
		FinSi
	FinPara
	
	Si d1 <> aux o d2 <> aux
		return = Falso
	FinSi
FinSubProceso
