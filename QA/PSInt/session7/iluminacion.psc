// Menu opción 8:
SubProceso calcularIluminacion()
	Definir ancho, largo Como Real
	Escribir "Ingrese el largo de la habitación en metros"
	Leer largo
	Leer ancho
	
	Escribir calcularSuperficie(largo, ancho) * .20, " metros cuadrados de iluminación natural mínima."
FinSubProceso
