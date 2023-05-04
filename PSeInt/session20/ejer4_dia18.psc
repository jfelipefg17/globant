Algoritmo menu
	definir ans1, ans2, ans3 Como Caracter
	definir n, arr1, arr2, arr3, i Como Entero
	definir a, b ,c1,c2 Como Logico
	a=Falso
	b=Falso
	c1=Falso
	c2= Falso
	n=1
	ans2 = "4"
	Dimension arr2[n]
	Dimension arr1[n]
	Dimension arr3[n]
	n = 0
	Hacer
		escribir "¿quiere ver el menu? si o no"
		leer ans1
		si Minusculas(ans1) == "si" o Minusculas(ans1) == "s" Entonces
			escribir "elija una opción"
			escribir "a. Llenar VectorA"
			escribir "b. Llenar VectorB"
			escribir "c. Llenar VectoC con las suma de VerctorA y VectorB"
			escribir "d. Llenar VectoC con las resta de VerctorB y VectorA"
			escribir "e. Mostrar"
			escribir "f. Salir"
			leer ans2
			segun Minusculas(ans2) hacer
				"a":
					a= Verdadero
					si n == 0 Entonces
						escribir "ingrese el tamaño del vector"
						leer n
					FinSi
					
					VectorA(n,arr1)
				"b":
					b= Verdadero
					si n == 0 Entonces
						escribir "ingrese el tamaño del vector"
						leer n
					FinSi
					
					VectorB(n,arr2)
				"c":
					c1=Verdadero
					si a== Verdadero y b == Verdadero Entonces
						
						VectorCsuma(n,arr1,arr2,arr3)
					SiNo
						escribir "VectorA o VectorB o ambos estan sin definir"
					FinSi
				"d":
					c2=Verdadero
					si a== Verdadero y b == Verdadero Entonces
						
						VectorCresta(n,arr1,arr2,arr3)
					SiNo
						escribir "VectorA o VectorB o ambos estan sin definir"
					FinSi
				"e":
					Hacer
						escribir "¿qué Vector desea ver?"
						leer ans3
						segun Minusculas(ans3) hacer
							"a":
								si a == Verdadero Entonces
									VectorA(n,arr1)
									para i<-0 hasta n-1 Hacer
										escribir arr1[i]
									FinPara
								SiNo
									escribir "El vectorA no esta definido"
								FinSi
							"b":
								si b == Verdadero Entonces
									VectorB(n,arr2)
									para i<-0 hasta n-1 Hacer
										escribir arr2[i]
									FinPara
								SiNo
									escribir "El vectorB no esta definido"
								FinSi
							"c":
								si c1 == Verdadero Entonces
									VectorCsuma(n,arr1,arr2,arr3)
									para i<-0 hasta n-1 Hacer
										escribir arr3[i]
									FinPara
								SiNo
									si c2 == Verdadero Entonces
										VectorCresta(n,arr1,arr2,arr3)
										para i<-0 hasta n-1 Hacer
											escribir arr3[i]
										FinPara
									SiNo
										escribir "vectorC no definido"
									FinSi
									
								FinSi
							De Otro Modo:
								escribir "opcion no valida"
						FinSegun
					Mientras Que Minusculas(ans3) <> "a" y Minusculas(ans3) <> "b" y Minusculas(ans3) <> "c"
				"f": escribir ""
				De Otro Modo:
					escribir "opción no valida"
			FinSegun
		FinSi
		si Minusculas(ans1) == "no" o Minusculas(ans1) == "n" Entonces
			ans2 = "f"
		FinSi
		si Minusculas(ans1) <> "si" y Minusculas(ans1) <> "s" y Minusculas(ans1) <> "no" y Minusculas(ans1) <> "n" Entonces
			escribir "respuesta no valida"
		FinSi
	Mientras Que ans2 <> "f"
	
	escribir "ha salido del menu"
FinAlgoritmo

SubProceso VectorA(n,vector Por Referencia)
	definir i Como Entero
	para i<- 0 hasta n-1 Hacer
		vector[i] = Aleatorio(-100, 100)
	FinPara
FinSubProceso

SubProceso VectorB(n,vector Por Referencia)
	definir i Como Entero
	para i<- 0 hasta n-1 Hacer
		vector[i] = Aleatorio(-100, 100)
	FinPara
FinSubProceso

SubProceso VectorCsuma(n,vector1,vector2,vector3 Por Referencia)
	definir i Como Entero
	para i<- 0 hasta n-1 Hacer
		vector3[i] = vector1[i] + vector2[i]
	FinPara
FinSubProceso

SubProceso VectorCresta(n,vector1,vector2,vector3 Por Referencia)
	definir i Como Entero
	para i<- 0 hasta n-1 Hacer
		vector3[i] = vector2[i] - vector1[i]
	FinPara
FinSubProceso
	