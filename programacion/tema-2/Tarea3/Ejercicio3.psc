

Algoritmo Ejercicio3
	n es entero
	factorial es entero
	numIntroducido es entero
	Escribir "Escribir un número positivo : "
	leer n
	n <- numIntroducido
	factorial <- 1
	
	// Comprobación de que es un número positivo.
	si n >= 0 Entonces
		si n = 0 Entonces
			factorial <- 1
		SiNo
			Repetir
				factorial <- factorial * n
				n <- - 1
			Hasta Que n = 0
		FinSi
		Escribir "El factorial de " numIntroducido " es " factorial
 	sino 
		Escribir n " es un número negativo. "
	FinSi
	
	
FinAlgoritmo
