Algoritmo Ejercicio1b
	Escribir "DAme un numero"
	Leer unNumero
	numDivisores<-cantidadDivisores(unNumero)
	Escribir "LA cantidad de divisores devuelta por la funcion para " unNumero " es " numDivisores
FinAlgoritmo

SubAlgoritmo divisores <- cantidadDivisores(num)
	divisores,i Es Entero
	divisores<-0
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num mod i = 0 Entonces
			divisores<-divisores + 1
		FinSi
	FinPara
FinSubAlgoritmo
