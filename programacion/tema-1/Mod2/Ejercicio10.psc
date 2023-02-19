Algoritmo NumEnMedio
	//Entorno
	a, b, c Es Entero
	Escribir "Introduce tres números"
	Leer a, b, c
	Si (a<b y b < c) o (c<b y b<a) Entonces
		Escribir b, " es el número de enmedio"
	SiNo
		Si (b<a y a <c) o (c<a y a<b) Entonces
			Escribir a, " es el número de enmedio"
		Sino 
			Si (a<c y c<b) o (b<c y c<a) Entonces
				Escribir c, " es el número de enmedio"
			FinSi
							
		FinSi
	FinSi
FinAlgoritmo
