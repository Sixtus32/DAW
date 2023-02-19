Algoritmo Ejercicio8
	Definir contador,contPositivos, num Como Entero
	contador<-0
	contPositivos<-0
	Repetir 
		Escribir  "Introduce un numero"
		Leer num
		si num>=0 Entonces
			contPositivos<-contPositivos+1
		FinSi
		contador<-contador+1
	Hasta Que contador>4
	Escribir "El número de positivos es " contPositivos
FinAlgoritmo
