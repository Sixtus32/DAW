Algoritmo Ejercicio9
	Definir contador,nota Como Entero
	Para contador<-1 hasta 5 Con Paso 1
		Escribir  "Introduce una nota"
		Leer nota
		si nota>=0 y nota <=10 Entonces
			si nota>=5 Entonces
				Escribir "Aprobado"
			SiNo
				Escribir "Insuficiente"
			FinSi
		SiNo
			Escribir "Nota inválida"
		FinSi
	FinPara
	
FinAlgoritmo
