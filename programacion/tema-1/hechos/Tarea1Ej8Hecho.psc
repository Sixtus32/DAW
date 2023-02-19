Algoritmo sin_titulo
	definir num1, contador, contPositivos Como Entero
	contador <- 0
	contPositivos <- 0
	Repetir
		Escribir "Introduce un número"
		Leer num1
		si num1 >= 0 Entonces
			contPositivos <- contPositivos + 1
		FinSi
		contador <- contador + 1
	Hasta Que contador > 4
	Escribir contPositivos
FinAlgoritmo
