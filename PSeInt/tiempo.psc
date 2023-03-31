Algoritmo ciclista
	Definir HH, MM, SS, T, HH2, MM2, SS2, aux1, aux2, aux3 Como Real
	Leer HH, MM, SS, T
	SS2 = SS + (T % 60)
	aux1 = trunc (T / 60)
	MM2 = MM + (aux1 % 60)
	aux2 = trunc (aux1 / 60)
	HH2 = HH + (aux2 % 60)
	
	Escribir "hora de llegada: ", HH2, "hs ", MM2, "min ", SS2, "seg."
	
FinAlgoritmo
