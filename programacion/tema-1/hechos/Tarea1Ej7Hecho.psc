Algoritmo sin_titulo
	Definir num1, num2, contador, producto Como Entero
	Escribir "Introduce el primer n�mero (Entre 10 y 20): "
	Leer num1
	Escribir "Introduce el segundo n�mero (Entre 10 y 20): "
	Leer num2
	producto <- 0
	contador <- 0
	Si (num1 >= 10 y num1 <= 20) y (num2 >= 10 y num2 <= 20)
		Mientras contador < num2 Hacer
			producto <- producto + num1
			contador <- contador + 1		
		FinMientras
		Escribir "Producto : " producto
		
	SiNo
		Escribir "Primer n�mero o el Segundo n�mero est�n fuera del rango"
	FinSi	
FinAlgoritmo
