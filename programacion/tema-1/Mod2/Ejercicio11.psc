Algoritmo NotasAlfanumericas
	Definir nota Como Entero
	Escribir "Introduce una nota"
	Leer nota
	Segun nota hacer
		1 o 2 o 3 o 4: Escribir "Insuficiente"
		5: Escribir "Suficiente"
		6: Escribir "Bien"
		7 o 8: Escribir "Notable"
		9 o 10: Escribir "Sobresaliente"
		De Otro Modo:
			Escribir "Nota no válida (valores fuera del rango [1 ... 10]"
	FinSegun
	
FinAlgoritmo
