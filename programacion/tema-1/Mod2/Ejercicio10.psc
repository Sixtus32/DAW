Algoritmo NumEnMedio
	//Entorno
	a, b, c Es Entero
	Escribir "Introduce tres n�meros"
	Leer a, b, c
	Si (a<b y b < c) o (c<b y b<a) Entonces
		Escribir b, " es el n�mero de enmedio"
	SiNo
		Si (b<a y a <c) o (c<a y a<b) Entonces
			Escribir a, " es el n�mero de enmedio"
		Sino 
			Si (a<c y c<b) o (b<c y c<a) Entonces
				Escribir c, " es el n�mero de enmedio"
			FinSi
							
		FinSi
	FinSi
FinAlgoritmo
