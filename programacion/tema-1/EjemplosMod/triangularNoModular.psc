Algoritmo sin_titulo
	Definir unNumero Como Entero
	Leer unNumero
	Si estriangular(unNumero) = Verdadero Entonces
		Escribir "El número " unNumero " es triangular"
	SiNo
		Escribir "El número " unNumero " NO es triangular"
	FinSi
FinAlgoritmo
SubAlgoritmo devolver <- estriangular(num)	
	Definir devolver Como Logico
	Definir suma,i Como Entero
	suma <-0
	i<-0
	Mientras suma<num hacer
		suma<-suma+i
		i<-i+1
	FinMientras
	Escribir suma
	Si suma = num Entonces
		devolver <- Verdadero
	sino 
		devolver <- Falso
	FinSi
FinSubAlgoritmo

	