Algoritmo Ejercicio1c
	Escribir "Introduce un número : "
	Leer numIntroducido
	numDivisores <- cantidadDivisores(numIntroducido)
	Escribir "El número de divisores es de : " numDivisores
FinAlgoritmo

SubAlgoritmo divisor <- cantidadDivisores(num)
	definir divisor, i Como Entero
	divisor<-0
	para i <- 1 hasta num Con Paso 1 Hacer
		si num mod i = 0 Entonces
			Escribir "Divisores : " i
			divisor<-divisor+1			
		FinSi
	FinPara
FinSubAlgoritmo
