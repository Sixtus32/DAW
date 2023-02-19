Algoritmo Ejercicio4
	//
	Definir entDedosPC, entDedosJugador, entSumaDedos, entOpcion como entero
	
	//pide que elijas entre pares o nones
	Escribir "Elige pares o nones"
	// O opción 1 o 2.
	Escribir "1- Pares 2- Nones"
	Escribir "Elige una opción"
	Leer entOpcion
	
	// Los dedos que saca el jugador 
	Escribir "¿Cuántos dedos sacas?"
	Leer entDedosJugador
	
	// Genera los dedos que saca el ordenador
	entDedosPC=Aleatorio(0,5)
	Escribir "Lo que saco el ordenador : " entDedosPC
	
	entSumaDedos=entDedosPC + entDedosJugador
	Segun entOpcion Hacer
		1: 
			si(entSumaDedos mod 2=0) Entonces
				escribir "Has ganado"
			sino 
				escribir "Has perdido"				
			FinSi
		2:
			si(entSumaDedos mod 2 <> 0) Entonces
				escribir "Has ganado"
			sino 
				escribir "Has perdido"
			FinSi
	FinSegun
	
FinAlgoritmo
