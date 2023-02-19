Algoritmo NumPares
	//Entorno
	num, contadorPares, contador es Entero
	contadorPares <- 0
	contador <- 0
	num <- 0
	Mientras contadorPares < 3 y contador < 20 Hacer
		Escribir "Dame un numero "
		Leer num
		Si num MOD 2 = 0 Entonces
			contadorPares <- contadorPares + 1
		Sino 
			contadorPares<-0
		FinSi
		contador <- contador + 1
	Fin Mientras
	Si contadorPares = 3 Entonces
		Escribir "Se hallaron 3 numeros pares"
	SiNo
		Escribir "No se encontraron 3 pares"
	FinSi
	FinAlgoritmo
