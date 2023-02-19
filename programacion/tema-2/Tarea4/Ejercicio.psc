Algoritmo Ejercicio6
	Escribir "Introduce un número : "
	Leer valorIntroducido
	num1 es entero
	num1 <- cubo(valorIntroducido)
	Escribir "El valor de " valorIntroducido , " al cubo es : " num1
FinAlgoritmo

funcion resultado <- cubo(num)
	resultado es entero
	resultado <- num * num * num
FinFuncion
