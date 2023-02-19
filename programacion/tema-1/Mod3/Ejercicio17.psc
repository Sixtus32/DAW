Algoritmo sin_titulo
	//Entorno
	Definir entDedosPC, entDedosJugador, entSumaDedos, entOpcion Como Entero
	
	Escribir "1- Pares 2- Nones"
	Escribir "Elige una opcion:"
	Leer entOpcion
	Escribir "¿Cuántos dedos sacas?"
	Leer entDedosJugador
	entDedosPC = Aleatorio(0,5)
	entSumaDedos = entDedosPC + entDedosJugador
	Segun entOpcion hacer
		
		1: 
			si (entSumaDedos MOD 2 = 0) entonces
				escribir "Has ganado"
			sino
				escribir "Has perdido"
			finsi
		2:
			si (entSumaDedos MOD 2 <>0) entonces
				escribir "Has ganado"
			sino
				escribir "Has perdido"
			finsi
		De Otro Modo:
			escribir "Opcion invalida"
			
	FinSegun
		
FinAlgoritmo
