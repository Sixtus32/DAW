Algoritmo sin_titulo
	Definir nota1, media Como Real
	Definir contador Como Entero
	contador<-0
	Repetir 
		Escribir "Introduce una nota"
		Leer nota1
		contador<-contador+1
		media<-media+nota1
	Hasta Que contador=3
	media<-(nota1+nota2+nota3)/3
	Escribir "La nota media es " media
FinAlgoritmo
