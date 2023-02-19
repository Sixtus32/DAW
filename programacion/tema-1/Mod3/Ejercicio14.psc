Algoritmo CalculaFactorial
	//Entorno
	N Es Entero //N debe ser entero positivo, es decir, debe ser un numero natural
	factorial Es Entero
	//Sentencias
	Escribir "Introduce un número positivo"
	Leer N
	factorial <- 1
	si N Es Mayor o igual A 0 Entonces
		Si N = 0 Entonces 
			factorial<- 1
		sino 
			Repetir
				factorial <- factorial * N
				N<- N-1
			Hasta Que N Es Igual A 0
		FinSi
			Escribir "Resultado ", factorial
	sino
			Escribir "Error, numero negativo"
	FinSi
	
FinAlgoritmo
