//Ejercicio 12 Realiza un programa en pseudoc�digo 
//que lea n�meros enteros y que finalice la lectura 
//cuando encuentre 3 n�meros pares seguidos o cuando 
//haya le�do 20 n�meros. 
Algoritmo Ejercicio1
	definir number, contador1, contador2, resultado Como Entero
	contador1<-0
	contador2<-0
	
	Mientras contador1 <> 3 y contador2 <> 20 Hacer
		Leer number
		si number mod 2 == 0 Entonces
			contador1 = contador1 + 1
		SiNo
			contador2=contador2 + 1
		FinSi
	FinMientras
	
	Si contador1 = 3
		Escribir "Se hallaron 3 n�meros pares."
	sino contador2 = 20
		Escribir "No se hallaron ning�n n�meros pares seguidos."
	FinSi

FinAlgoritmo
