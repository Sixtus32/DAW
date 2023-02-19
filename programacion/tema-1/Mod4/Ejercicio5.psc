Algoritmo sin_titulo
	Definir num Como Entero
	Escribir "Dame un numero"
	Leer num
	Si esPar(num) = Verdadero Entonces
		Escribir "Es par"
	Sino 
		Escribir "Es impar"
	FinSi
FinAlgoritmo
SubAlgoritmo resultado <- esPar(n)
	resultado Es Logico
	Si n MOD 2 = 0 Entonces
		resultado <- Verdadero
	Sino 
		resultado<- Falso
	FinSi
FinSubAlgoritmo
