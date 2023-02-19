Algoritmo sin_titulo
	Definir unNumero Como Entero
	Leer unNumero
	estriangular(unNumero)
FinAlgoritmo

SubAlgoritmo estriangular(num)	
	Definir suma,i Como Entero
	suma <-0
	i<-0
	Mientras suma<num hacer
		suma<-suma+i
		i<-i+1
	FinMientras
	Escribir suma
	Si suma = num Entonces
		Escribir "El número " num " es Triangular"
	sino 
		Escribir "El número " num " NO es Triangular"
	FinSi
FinSubAlgoritmo
