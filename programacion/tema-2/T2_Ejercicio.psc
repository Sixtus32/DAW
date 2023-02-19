Algoritmo T2_Ejercicio7
	Definir num1, num2, contador, producto Como Entero
	Escribir "Introduce dos números entre 10 y 20"
	Leer num1, num2
	Si (num1>=10 y num1<=20) y (num2>=10 y num2<=20) Entonces
		producto<-0
		contador<-0
		Mientras contador < num2 Hacer
			producto <- producto + num1
			contador<-contador+1
		FinMientras
		Escribir "Producto " producto
	Sino 
		Escribir "num1 o num2 están fuera de rango"
	FinSi
FinAlgoritmo
