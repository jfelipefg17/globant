Algoritmo ejerExtra5_bien_dia19
	definir vec, frase, cara Como Caracter
	definir i, posi, esp1, esp2, f, z, e Como Entero
	z=0
	escribir "ingrese frase"
	leer frase
	escribir "elija un caracter para poner en el arreglo"
	leer cara
	escribir "elija posición para poner el caracter"
	leer posi
	Dimension vec[20]
	para i<-0 hasta 19 Hacer
		vec[i]=Subcadena(frase,i,i)
		si i < posi Entonces
			si vec[i] == " " Entonces
				esp1 = i
			FinSi
		FinSi
		si i > posi Entonces
			si vec[i] == " " Entonces
				z= z +1
				si z == 1 Entonces
					esp2 = i
				FinSi
			FinSi
		FinSi
	FinPara
	
	si (abs(esp2-posi)) > (abs(esp1-posi)) Entonces
		para i <- 0 hasta 19 Hacer
			si i < posi entonces
				vec[i]=Subcadena(frase,i,i)
				
			FinSi
			si i == posi Entonces
				vec[i] = cara
			FinSi
			si i > posi Entonces
				e = i -1
				vec[i]=Subcadena(frase,e,e)
				
			FinSi
			
		FinPara
		para i <- 0 hasta 18 Hacer
			f= i + 1
			escribir Sin Saltar vec[f]
		FinPara
	SiNo
		para i<-0 hasta 19 Hacer
			si i < posi entonces
				vec[i]=Subcadena(frase,i,i)
				
			FinSi
			si i == posi Entonces
				vec[i] = cara
			FinSi
			si i > posi Entonces
				e = i -1
				vec[i]=Subcadena(frase,e,e)
				
			FinSi
			
		FinPara
		para i <- 0 hasta 19 Hacer
			escribir Sin Saltar vec[i]
		FinPara
		
	FinSi

	

	
FinAlgoritmo
