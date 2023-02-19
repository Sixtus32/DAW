Algoritmo Tarea1Ej9Hecho
	definir notas, contador Como Entero
	contador <- 0
	
	Repetir
		Escribir "Introduce nota"
		leer notas
		si (notas >= 0 y notas <= 10) Entonces
			si notas >= 5 Entonces
				Escribir "Aprovado"
			sino 
				escribir "Suspenso"
			FinSi
		sino 
			Escribir "Nota introducida NO ES VÁLIDA."
		FinSi
		contador <- contador + 1
	Hasta Que contador > 4
FinAlgoritmo
