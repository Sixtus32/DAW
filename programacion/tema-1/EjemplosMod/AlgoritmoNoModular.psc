//Calcular el area y perimetro de un circulo dado su radio
//sin modularidad
Algoritmo NoModular
	Definir radio,area,perimetro  Como Real
	Escribir "Introduce el radio"
	Leer radio
	area <- PI * radio * radio
	perimetro <- 2 * PI * radio
	//Resultados
	Escribir "El area del circulo con radio " radio " es " area
	Escribir "El perimetro del circulo con radio " radio " es " perimetro
FinAlgoritmo
