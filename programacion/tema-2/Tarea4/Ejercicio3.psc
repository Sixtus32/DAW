Algoritmo Ejercicio3
	Leer frase
	escribirEspaciado(frase)
FinAlgoritmo

SubProceso escribirEspaciado (text)
	size=Longitud(text)
	sumTexto<-""
	Para i <- 0 Hasta  size Hacer
		sumTexto<-Concatenar(sumTexto, Concatenar(Subcadena(text, i , i ), " "))
	FinPara
	Escribir sumTexto
FinSubProceso
