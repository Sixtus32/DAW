Algoritmo Ejercicio1
	definir resultado como entero
	Escribir "Dame un n�mero : "
	Leer unNumero
	cantidadDivisores(unNumero)
FinAlgoritmo

Funcion cantidadDivisores(num)
	definir i, numDivisores Como Entero
	para i <- 1 hasta num Con Paso 1 Hacer
		si num mod i = 0 Entonces
			numDivisores<-numDivisores + 1
			Escribir "Divisores : " i
		FinSi
	FinPara
	Escribir "El n�mero de divisores es : " numDivisores
FinFuncion
	