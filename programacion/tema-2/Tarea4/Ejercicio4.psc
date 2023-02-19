Algoritmo Ejercicio4
	definir resultado, n1, n2, n3 Como Entero
	Leer n1, n2, n3
	resultado <- mayorDeTres(n1, n2, n3)
	Escribir "El mayor de todos es : " resultado
FinAlgoritmo

Funcion elMayor <- mayorDeTres (num1, num2, num3)
	definir elMayor Como Entero
	si num1 >= num2 y num1 >= num3
		elMayor <- num1
	SiNo
		si num2 >= num1 y num2 >= num3
			elMayor <- num2
		SiNo
			elMayor <- num3
		FinSi		
	FinSi
FinFuncion
