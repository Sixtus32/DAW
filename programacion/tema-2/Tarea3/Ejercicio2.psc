//Ejercicio 13 Programa que lee, 
//ordena y muestra ordenados tres números enteros.
Algoritmo Ejercicio2
	Definir number1,number2, number3, contador Como Entero
	Mientras contador < 3 Hacer
		Leer number1,number2,number3
		si number1 < number2 y number2 < number3 Entonces
			Escribir number1 " < " number2 " < " number3
		sino
			si number1 = number2 y number1 < number3 Entonces
				Escribir number1 " = " number2 " < " number3
			sino
				
			FinSi
		FinSi
		
	FinMientras

	
FinAlgoritmo
