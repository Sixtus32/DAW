Algoritmo Clase5
	escribir "Nº de niños : "
	leer nNino
	escribir "Nº de niñas : "
	leer nNina
	porcentajeNino <- nNino * 100 / (nNino + nNina)
	porcentajeNina <- 100 - porcentajeNino
	Imprimir "Hay un " porcentajeNino " % de niños ."
	Imprimir "Hay un " porcentajeNina " % de niñas ."
FinAlgoritmo
