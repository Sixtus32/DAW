Algoritmo sin_titulo
	Leer cadenaCaracteres
	escribirEspaciado(cadenaCaracteres)
FinAlgoritmo
SubAlgoritmo escribirEspaciado(text)
	size = Longitud(text)
	otracade<-""
	Para i<-0 Hasta size hacer
		otracade<-Concatenar(otracade,Concatenar(Subcadena(text,i,i)," "))
	FinPara
	Escribir otracade
FinSubAlgoritmo
	