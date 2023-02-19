Algoritmo Ejercicio5
	definir logic Como Logico
	Escribir "Introduce número : "
	Leer numeroA
	logic <- esPar(numeroA)
	Escribir logic
FinAlgoritmo

Funcion valorLogico <- esPar (numeroIntroducido)
	definir valorLogico Como Logico
	si numeroIntroducido mod 2 == 0
		valorLogico <- Verdadero
	sino 
		valorLogico <- Falso
	FinSi
FinFuncion
