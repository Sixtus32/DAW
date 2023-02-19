Algoritmo Ejercicio5
	//Entorno
	Definir entAnio Como Entero
	leer entAnio
	si((entAnio mod 4 = 0) y ((entAnio mod 100 <> 0) o (entAnio mod 400 = 0))) Entonces
		escribir "Es bisiesto"
	sino 
		escribir "No es bisiesto"
	FinSi
FinAlgoritmo
